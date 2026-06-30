package h45;

/* loaded from: classes9.dex */
public interface q extends i95.m {
    boolean TenPaySDKABTestKindaEnable();

    boolean canOpenKindaCashier(android.content.Context context);

    void checkIfNeedRequestUserBindqueryWhenUnBindCard(java.lang.String str);

    void checkIfNeedUpdateOfflinePayToken();

    void ensureLibraryLoaded();

    long getAccountLoginSuccessTime();

    long getAppColdStartTime();

    long getColorByMode(long j17, long j18);

    android.app.Activity getCrossActivity();

    java.lang.String getDeeplinkUrlInMemory();

    long getFirstPreloadTime();

    java.lang.String getKindaLiteUseCaseSessionId();

    long getLastEnterForegroundTime();

    java.lang.String getOverseaFunctionUrlWithToken(java.lang.String str);

    boolean handleHKHongbaoRouteInfoFromUriSpan(java.lang.String str);

    void handleHKNativeCashier(android.content.Context context, android.os.Bundle bundle, h45.k kVar);

    void handleHKOfflineNewXmlMsg(java.lang.String str);

    void handleHKWalletScanCodeRoute(java.lang.String str, int i17, h45.i iVar);

    boolean isDeviceSupportNFC();

    boolean isEnableLiteAppUseCase(java.lang.String str, java.lang.Object obj);

    boolean isKindaActivity(android.app.Activity activity);

    boolean isKindaEnabled();

    boolean isKindaLitePaying();

    boolean isOfflineReady();

    boolean isSwitch2InWxAppPay(java.lang.String str);

    boolean isUseCaseAlive(java.lang.String str);

    void markFirstPreloadTimeIfNeeded();

    void notifyAddPaycardUsecase(android.os.Bundle bundle, java.lang.String str, h45.i iVar);

    void notifyAllLiteAppForPay(java.lang.String str, java.util.Map map);

    void notifyAllUseCase(java.lang.Object obj);

    void notifyKindaOnManualAuthOk();

    void notifyRealnameCancel();

    void notifyRealnameEnd();

    void notifyUploadCardSuccess();

    void notifyWalletPageRefresh();

    byte[] parseHKHongbaoRouteInfoData(java.lang.String str, java.lang.String str2);

    void preloadKindalite();

    int registerLiteAppModuleEventForPay(java.lang.String str, h45.m mVar);

    void requestHKCashierFromLite(org.json.JSONObject jSONObject, h45.j jVar);

    void requestHKCashierNotify(android.content.Context context, java.lang.String str);

    void saveDeeplinkUrlInMemory(java.lang.String str);

    void setCurrentSeesionUserName(java.lang.String str);

    void setOverseaUrlTokens(java.lang.String str, java.lang.String str2);

    boolean shouldHandleHKWalletCGPUrl(java.lang.String str);

    void startBindCardUseCase(android.content.Context context, android.os.Bundle bundle);

    void startFaceCheckUseCase(java.lang.String str, android.content.Intent intent, h45.i iVar);

    void startFastBindUseCase(java.lang.String str, int i17, java.lang.Runnable runnable);

    void startGetEncryptHKPasswd(java.lang.String str, h45.i iVar);

    void startHKOfflinePrePay(android.content.Context context, int i17);

    void startHKOfflinePrePayFromJsApi(android.content.Context context, java.lang.String str);

    void startInWxAppPayUseCase(android.content.Context context, android.os.Bundle bundle);

    void startInWxAppPayUseCase(h45.l lVar, android.os.Bundle bundle);

    void startJSApiWCPaySecurityCrosscut(java.util.Map map);

    void startJsApiComponentUseCase(android.content.Context context, com.tencent.mm.pluginsdk.wallet.WalletJsapiData walletJsapiData, com.tencent.mm.ui.da daVar, int i17);

    void startKindaWalletLockVerify(android.content.Intent intent, int i17, h45.i iVar);

    void startListen(java.lang.String str, h45.n nVar);

    boolean startLqtDetailUseCaseInMMProcess(android.content.Context context);

    boolean startLqtDetailUseCaseInOtherProcess();

    boolean startLqtDetailUseCaseWithBalanceInMMProcess(android.content.Context context, long j17);

    boolean startLqtFetchUseCase(android.content.Context context, android.content.Intent intent, h45.i iVar);

    void startLqtFixedDepositMakePlanUseCase(android.content.Context context, android.os.Bundle bundle);

    void startLqtFixedDepositPlanListUseCase(android.content.Context context, android.os.Bundle bundle);

    boolean startLqtSaveUseCase(android.content.Context context, android.content.Intent intent, h45.i iVar);

    void startModifyPwdUseCase(android.content.Context context, android.os.Bundle bundle);

    void startOfflinePay(android.content.Context context, java.lang.String str, java.lang.String str2, int i17);

    void startOfflinePrePay(android.content.Context context, int i17, int i18, int i19, java.util.Map map, boolean z17, java.lang.String str, h45.i iVar);

    boolean startOverseaWalletSuccPageUseCase(android.content.Context context, android.os.Bundle bundle);

    void startPatternLockUseCase(android.content.Intent intent, boolean z17, h45.i iVar);

    boolean startPayIBGJsGetSuccPageUseCase(android.content.Context context, android.os.Bundle bundle);

    void startPaySecurityUseCase(int i17, h45.i iVar);

    void startQrcodeCollectionSettingUseCase(android.content.Intent intent, h45.i iVar);

    void startResetPwdUseCase(android.content.Context context, android.os.Bundle bundle);

    boolean startResetPwdUseCaseFromJsApi(android.content.Intent intent, h45.i iVar);

    void startSNSPay(android.content.Context context, com.tencent.mm.pluginsdk.wallet.PayInfo payInfo);

    void startScanQRCodePay(android.content.Context context, android.os.Bundle bundle);

    void startTeenagerPay(android.content.Context context, byte[] bArr, h45.i iVar);

    void startTeenagerPayGetDetail(android.content.Context context, h45.o oVar);

    void startTouchLockUseCase(android.content.Intent intent, boolean z17, h45.i iVar);

    void startUiTest(java.lang.String str);

    void startUniPcPay(android.os.Bundle bundle, h45.i iVar);

    void startUseCase(java.lang.String str, java.lang.Object obj, java.lang.Object obj2);

    boolean startWalletBalanceEntryUseCase(android.content.Context context);

    void startWalletBalanceFetchPageUseCase(android.content.Context context, android.os.Bundle bundle);

    void startWalletBalanceFetchUseCase(android.content.Context context, android.os.Bundle bundle);

    void startWalletBalanceRechargeUIUseCase(android.content.Context context);

    void startWalletBalanceSaveUseCase(android.content.Context context, android.os.Bundle bundle);

    void startWalletLockSettingUseCase(android.content.Context context, android.content.Intent intent, h45.i iVar);

    void startWalletSecuritySetting(android.content.Context context, android.content.Intent intent);

    void startWeBankLoanPay(android.content.Context context, java.lang.String str, java.lang.String str2, h45.p pVar);

    void startWxpayAppPay(android.content.Context context, android.os.Bundle bundle, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4);

    void startWxpayH5Pay(android.content.Context context, android.os.Bundle bundle, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4);

    void startWxpayJsApiPay(android.content.Context context, com.tencent.mm.pluginsdk.wallet.WalletJsapiData walletJsapiData, com.tencent.mm.ui.da daVar, int i17);

    void startWxpayQueryCashierPay(java.lang.String str, int i17, int i18);

    void stopListen(java.lang.String str);

    boolean tryStartTransferToBankDetailUseCase(java.lang.String str, h45.i iVar);

    boolean tryStartTransferToBankUseCase(java.lang.String str, h45.i iVar);

    void unregisterLiteAppModuleEventForPay(java.lang.String str, int i17);

    void updateLocationCacheIfNeed(float f17, float f18, long j17, java.lang.String str, int i17);

    void updateOfflinePayDefaultCard(java.lang.String str, java.lang.String str2);

    void updateOfflinePayTokenFromScene(int i17);
}
