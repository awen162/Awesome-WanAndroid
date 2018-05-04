package json.chao.com.wanandroid.contract.main;

import json.chao.com.wanandroid.base.presenter.AbstractPresenter;
import json.chao.com.wanandroid.base.view.BaseView;
import json.chao.com.wanandroid.core.bean.main.login.LoginData;

/**
 * @author quchao
 * @date 2018/5/4
 */
public interface RegisterContract {

    interface View extends BaseView {

        /**
         * Show register data
         *
         * @param loginData LoginData
         */
        void showRegisterData(LoginData loginData);
    }

    interface Presenter extends AbstractPresenter<RegisterContract.View> {

        /**
         * 注册
         * http://www.wanandroid.com/user/register
         *
         * @param username user name
         * @param password password
         * @param rePassword re password
         */
        void getRegisterData(String username, String password, String rePassword);
    }
}
