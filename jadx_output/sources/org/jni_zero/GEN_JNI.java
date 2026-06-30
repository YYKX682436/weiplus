package org.jni_zero;

/* loaded from: classes16.dex */
public class GEN_JNI {
    public static final boolean REQUIRE_MOCK = false;
    public static final boolean TESTING_ENABLED = false;

    public static void org_chromium_base_ApplicationStatus_onApplicationStateChange(int i17) {
        J.N.MiAkQ_SU(i17);
    }

    public static long org_chromium_base_BaseFeatureMap_getNativeMap() {
        return J.N.MshdYEWu();
    }

    public static void org_chromium_base_CommandLine_appendSwitch(java.lang.String str) {
        J.N.M5K_ewhl(str);
    }

    public static void org_chromium_base_CommandLine_appendSwitchWithValue(java.lang.String str, java.lang.String str2) {
        J.N.MUoYiNbY(str, str2);
    }

    public static void org_chromium_base_CommandLine_appendSwitchesAndArguments(java.lang.String[] strArr) {
        J.N.MPquHBNa(strArr);
    }

    public static java.lang.String org_chromium_base_CommandLine_getSwitchValue(java.lang.String str) {
        return J.N.MZJ2lrZY(str);
    }

    public static java.lang.String[] org_chromium_base_CommandLine_getSwitchesFlattened() {
        return J.N.MHzche6O();
    }

    public static boolean org_chromium_base_CommandLine_hasSwitch(java.lang.String str) {
        return J.N.MsCvypjU(str);
    }

    public static void org_chromium_base_CommandLine_init(java.lang.String[] strArr) {
        J.N.MDkrKi31(strArr);
    }

    public static void org_chromium_base_CommandLine_removeSwitch(java.lang.String str) {
        J.N.M1cMYXGO(str);
    }

    public static int org_chromium_base_CpuFeatures_getCoreCount() {
        return J.N.MOiBJ1qS();
    }

    public static long org_chromium_base_CpuFeatures_getCpuFeatures() {
        return J.N.ML0T8q1U();
    }

    public static void org_chromium_base_EarlyTraceEvent_recordEarlyAsyncBeginEvent(java.lang.String str, long j17, long j18) {
        J.N.M_Gv8TwM(str, j17, j18);
    }

    public static void org_chromium_base_EarlyTraceEvent_recordEarlyAsyncEndEvent(long j17, long j18) {
        J.N.MrKsqeCD(j17, j18);
    }

    public static void org_chromium_base_EarlyTraceEvent_recordEarlyBeginEvent(java.lang.String str, long j17, int i17, long j18) {
        J.N.MrWG2uUW(str, j17, i17, j18);
    }

    public static void org_chromium_base_EarlyTraceEvent_recordEarlyEndEvent(java.lang.String str, long j17, int i17, long j18) {
        J.N.MmyrhqXB(str, j17, i17, j18);
    }

    public static void org_chromium_base_EarlyTraceEvent_recordEarlyToplevelBeginEvent(java.lang.String str, long j17, int i17, long j18) {
        J.N.M7UXCmoq(str, j17, i17, j18);
    }

    public static void org_chromium_base_EarlyTraceEvent_recordEarlyToplevelEndEvent(java.lang.String str, long j17, int i17, long j18) {
        J.N.MRlw2LEn(str, j17, i17, j18);
    }

    public static boolean org_chromium_base_FeatureList_isInitialized() {
        return J.N.MFTJCvBh();
    }

    public static java.lang.String org_chromium_base_FeatureMap_getFieldTrialParamByFeature(long j17, java.lang.String str, java.lang.String str2) {
        return J.N.MkEZDArf(j17, str, str2);
    }

    public static boolean org_chromium_base_FeatureMap_getFieldTrialParamByFeatureAsBoolean(long j17, java.lang.String str, java.lang.String str2, boolean z17) {
        return J.N.MR5ZSvGM(j17, str, str2, z17);
    }

    public static double org_chromium_base_FeatureMap_getFieldTrialParamByFeatureAsDouble(long j17, java.lang.String str, java.lang.String str2, double d17) {
        return J.N.MVPjCt$S(j17, str, str2, d17);
    }

    public static int org_chromium_base_FeatureMap_getFieldTrialParamByFeatureAsInt(long j17, java.lang.String str, java.lang.String str2, int i17) {
        return J.N.Me$URWJx(j17, str, str2, i17);
    }

    public static java.lang.String[] org_chromium_base_FeatureMap_getFlattedFieldTrialParamsForFeature(long j17, java.lang.String str) {
        return J.N.MV_QqWU4(j17, str);
    }

    public static boolean org_chromium_base_FeatureMap_isEnabled(long j17, java.lang.String str) {
        return J.N.M2evocmp(j17, str);
    }

    public static boolean org_chromium_base_Features_getFieldTrialParamByFeatureAsBoolean(long j17, java.lang.String str, boolean z17) {
        return J.N.M8R55Xut(j17, str, z17);
    }

    public static java.lang.String org_chromium_base_Features_getFieldTrialParamByFeatureAsString(long j17, java.lang.String str) {
        return J.N.M9wfStLu(j17, str);
    }

    public static boolean org_chromium_base_Features_isEnabled(long j17) {
        return J.N.MRiRQ_Ey(j17);
    }

    public static boolean org_chromium_base_FieldTrialList_createFieldTrial(java.lang.String str, java.lang.String str2) {
        return J.N.MGqzwlIM(str, str2);
    }

    public static java.lang.String org_chromium_base_FieldTrialList_findFullName(java.lang.String str) {
        return J.N.MdC43qwX(str);
    }

    public static java.lang.String org_chromium_base_FieldTrialList_getVariationParameter(java.lang.String str, java.lang.String str2) {
        return J.N.MZWMOP4I(str, str2);
    }

    public static void org_chromium_base_FieldTrialList_logActiveTrials() {
        J.N.MHz6Fn06();
    }

    public static boolean org_chromium_base_FieldTrialList_trialExists(java.lang.String str) {
        return J.N.Mmqqda9c(str);
    }

    public static java.lang.String org_chromium_base_FileUtils_getAbsoluteFilePath(java.lang.String str) {
        return J.N.MWck3aif(str);
    }

    public static boolean org_chromium_base_ImportantFileWriterAndroid_writeFileAtomically(java.lang.String str, byte[] bArr) {
        return J.N.MsOKBrZ5(str, bArr);
    }

    public static void org_chromium_base_JavaExceptionReporter_reportJavaException(boolean z17, java.lang.Throwable th6) {
        J.N.MLlibBXh(z17, th6);
    }

    public static void org_chromium_base_JavaExceptionReporter_reportJavaStackTrace(java.lang.String str) {
        J.N.MmS4zlEt(str);
    }

    public static void org_chromium_base_JavaHandlerThread_initializeThread(long j17, long j18) {
        J.N.MJcct7gJ(j17, j18);
    }

    public static void org_chromium_base_JavaHandlerThread_onLooperStopped(long j17) {
        J.N.MYwg$x8E(j17);
    }

    public static void org_chromium_base_MemoryPressureListener_onMemoryPressure(int i17) {
        J.N.MZJzyjAa(i17);
    }

    public static void org_chromium_base_PathService_override(int i17, java.lang.String str) {
        J.N.M6H_IiaF(i17, str);
    }

    public static void org_chromium_base_PowerMonitor_onBatteryChargingChanged() {
        J.N.MCImhGql();
    }

    public static void org_chromium_base_PowerMonitor_onThermalStatusChanged(int i17) {
        J.N.MQNVaF2F(i17);
    }

    public static void org_chromium_base_SysUtils_logPageFaultCountToTracing() {
        J.N.MOXOasS5();
    }

    public static void org_chromium_base_TraceEvent_addViewDump(int i17, int i18, boolean z17, boolean z18, java.lang.String str, java.lang.String str2, long j17) {
        J.N.MmnP6i1r(i17, i18, z17, z18, str, str2, j17);
    }

    public static void org_chromium_base_TraceEvent_begin(java.lang.String str, java.lang.String str2) {
        J.N.M9XfPu17(str, str2);
    }

    public static void org_chromium_base_TraceEvent_beginToplevel(java.lang.String str) {
        J.N.M_y76mct(str);
    }

    public static void org_chromium_base_TraceEvent_beginWithIntArg(java.lang.String str, int i17) {
        J.N.MfyKGfoR(str, i17);
    }

    public static void org_chromium_base_TraceEvent_end(java.lang.String str, java.lang.String str2, long j17) {
        J.N.Mw73xTww(str, str2, j17);
    }

    public static void org_chromium_base_TraceEvent_endToplevel(java.lang.String str) {
        J.N.MLJecZJ9(str);
    }

    public static void org_chromium_base_TraceEvent_finishAsync(java.lang.String str, long j17) {
        J.N.MffNhCLU(str, j17);
    }

    public static void org_chromium_base_TraceEvent_initViewHierarchyDump(long j17, java.lang.Object obj) {
        J.N.Ml5G_GLY(j17, obj);
    }

    public static void org_chromium_base_TraceEvent_instant(java.lang.String str, java.lang.String str2) {
        J.N.ML40H8ed(str, str2);
    }

    public static void org_chromium_base_TraceEvent_instantAndroidIPC(java.lang.String str, long j17) {
        J.N.MgOW0Igo(str, j17);
    }

    public static void org_chromium_base_TraceEvent_instantAndroidToolbar(int i17, int i18, int i19) {
        J.N.MtoXPJsu(i17, i18, i19);
    }

    public static void org_chromium_base_TraceEvent_registerEnabledObserver() {
        J.N.MFFzPOVw();
    }

    public static long org_chromium_base_TraceEvent_startActivityDump(java.lang.String str, long j17) {
        return J.N.MwX2YEhL(str, j17);
    }

    public static void org_chromium_base_TraceEvent_startAsync(java.lang.String str, long j17) {
        J.N.MHopMqLX(str, j17);
    }

    public static boolean org_chromium_base_TraceEvent_viewHierarchyDumpEnabled() {
        return J.N.MnfJQqTB();
    }

    public static void org_chromium_base_TraceEvent_webViewStartupStage1(long j17, long j18) {
        J.N.MkM80XCq(j17, j18);
    }

    public static void org_chromium_base_TraceEvent_webViewStartupStage2(long j17, long j18, boolean z17) {
        J.N.MaLi67Df(j17, j18, z17);
    }

    public static void org_chromium_base_TraceEvent_webViewStartupTotalFactoryInit(long j17, long j18) {
        J.N.MsUcOjxl(j17, j18);
    }

    public static void org_chromium_base_jank_1tracker_JankMetricUMARecorder_recordJankMetrics(long[] jArr, boolean[] zArr, long j17, long j18, int i17) {
        J.N.MJ46uzUz(jArr, zArr, j17, j18, i17);
    }

    public static boolean org_chromium_base_library_1loader_LibraryLoader_libraryLoaded(int i17) {
        return J.N.M81WqFvs(i17);
    }

    public static void org_chromium_base_library_1loader_LibraryPrefetcher_forkAndPrefetchNativeLibrary() {
        J.N.MUjpxN8d();
    }

    public static int org_chromium_base_library_1loader_LibraryPrefetcher_percentageOfResidentNativeLibraryCode() {
        return J.N.MdFgVRJJ();
    }

    public static void org_chromium_base_library_1loader_LibraryPrefetcher_periodicallyCollectResidency() {
        J.N.MLXZo1U6();
    }

    public static long org_chromium_base_metrics_NativeUmaRecorder_addActionCallbackForTesting(java.lang.Object obj) {
        return J.N.MEfoV$c9_ForTesting(obj);
    }

    public static long org_chromium_base_metrics_NativeUmaRecorder_createHistogramSnapshotForTesting() {
        return J.N.MlZcyPle_ForTesting();
    }

    public static void org_chromium_base_metrics_NativeUmaRecorder_destroyHistogramSnapshotForTesting(long j17) {
        J.N.MqHgOQAN_ForTesting(j17);
    }

    public static long[] org_chromium_base_metrics_NativeUmaRecorder_getHistogramSamplesForTesting(java.lang.String str) {
        return J.N.MDr5ROsj_ForTesting(str);
    }

    public static int org_chromium_base_metrics_NativeUmaRecorder_getHistogramTotalCountForTesting(java.lang.String str, long j17) {
        return J.N.MP$RSyC4_ForTesting(str, j17);
    }

    public static int org_chromium_base_metrics_NativeUmaRecorder_getHistogramValueCountForTesting(java.lang.String str, int i17, long j17) {
        return J.N.M_1WxmXI_ForTesting(str, i17, j17);
    }

    public static long org_chromium_base_metrics_NativeUmaRecorder_recordBooleanHistogram(java.lang.String str, long j17, boolean z17) {
        return J.N.MtKTTHie(str, j17, z17);
    }

    public static long org_chromium_base_metrics_NativeUmaRecorder_recordExponentialHistogram(java.lang.String str, long j17, int i17, int i18, int i19, int i27) {
        return J.N.MILRV9Ch(str, j17, i17, i18, i19, i27);
    }

    public static long org_chromium_base_metrics_NativeUmaRecorder_recordLinearHistogram(java.lang.String str, long j17, int i17, int i18, int i19, int i27) {
        return J.N.M$oMD214(str, j17, i17, i18, i19, i27);
    }

    public static long org_chromium_base_metrics_NativeUmaRecorder_recordSparseHistogram(java.lang.String str, long j17, int i17) {
        return J.N.Mk1ai9mx(str, j17, i17);
    }

    public static void org_chromium_base_metrics_NativeUmaRecorder_recordUserAction(java.lang.String str, long j17) {
        J.N.MTDsfZGe(str, j17);
    }

    public static void org_chromium_base_metrics_NativeUmaRecorder_removeActionCallbackForTesting(long j17) {
        J.N.MUBbgum1_ForTesting(j17);
    }

    public static java.lang.String org_chromium_base_metrics_StatisticsRecorderAndroid_toJson(int i17) {
        return J.N.MvO$oy3r(i17);
    }

    public static boolean org_chromium_base_task_TaskRunnerImpl_belongsToCurrentThread(long j17) {
        return J.N.MdFi6sVQ(j17);
    }

    public static void org_chromium_base_task_TaskRunnerImpl_destroy(long j17) {
        J.N.MERCiIV8(j17);
    }

    public static long org_chromium_base_task_TaskRunnerImpl_init(int i17, int i18) {
        return J.N.M5_IQXaH(i17, i18);
    }

    public static void org_chromium_base_task_TaskRunnerImpl_postDelayedTask(long j17, java.lang.Object obj, long j18, java.lang.String str) {
        J.N.MGnQU$47(j17, obj, j18, str);
    }

    public static java.lang.String org_chromium_net_GURLUtils_getOrigin(java.lang.String str) {
        return J.N.MpCt7siL(str);
    }

    public static void org_chromium_net_HttpNegotiateAuthenticator_setResult(long j17, java.lang.Object obj, int i17, java.lang.String str) {
        J.N.M0s8NeYn(j17, obj, i17, str);
    }

    public static boolean org_chromium_net_HttpUtil_isAllowedHeader(java.lang.String str, java.lang.String str2) {
        return J.N.MorcXgQd(str, str2);
    }

    public static void org_chromium_net_NetworkActiveNotifier_notifyOfDefaultNetworkActive(long j17) {
        J.N.MSZPA7qE(j17);
    }

    public static void org_chromium_net_NetworkChangeNotifier_notifyConnectionCostChanged(long j17, java.lang.Object obj, int i17) {
        J.N.Mg0W7eRL(j17, obj, i17);
    }

    public static void org_chromium_net_NetworkChangeNotifier_notifyConnectionTypeChanged(long j17, java.lang.Object obj, int i17, long j18) {
        J.N.MbPIImnU(j17, obj, i17, j18);
    }

    public static void org_chromium_net_NetworkChangeNotifier_notifyMaxBandwidthChanged(long j17, java.lang.Object obj, int i17) {
        J.N.Mt26m31j(j17, obj, i17);
    }

    public static void org_chromium_net_NetworkChangeNotifier_notifyOfNetworkConnect(long j17, java.lang.Object obj, long j18, int i17) {
        J.N.MBT1i5cd(j17, obj, j18, i17);
    }

    public static void org_chromium_net_NetworkChangeNotifier_notifyOfNetworkDisconnect(long j17, java.lang.Object obj, long j18) {
        J.N.MDpuHJTB(j17, obj, j18);
    }

    public static void org_chromium_net_NetworkChangeNotifier_notifyOfNetworkSoonToDisconnect(long j17, java.lang.Object obj, long j18) {
        J.N.MiJIMrTb(j17, obj, j18);
    }

    public static void org_chromium_net_NetworkChangeNotifier_notifyPurgeActiveNetworkList(long j17, java.lang.Object obj, long[] jArr) {
        J.N.MpF$179U(j17, obj, jArr);
    }

    public static void org_chromium_net_ProxyChangeListener_proxySettingsChanged(long j17, java.lang.Object obj) {
        J.N.MCIk73GZ(j17, obj);
    }

    public static void org_chromium_net_ProxyChangeListener_proxySettingsChangedTo(long j17, java.lang.Object obj, java.lang.String str, int i17, java.lang.String str2, java.lang.String[] strArr) {
        J.N.MyoFZt$2(j17, obj, str, i17, str2, strArr);
    }

    public static void org_chromium_net_X509Util_notifyClientCertStoreChanged() {
        J.N.MJdorYDE();
    }

    public static void org_chromium_net_X509Util_notifyTrustStoreChanged() {
        J.N.M6C2IQIc();
    }

    public static long org_chromium_net_impl_CronetBidirectionalStream_createBidirectionalStream(java.lang.Object obj, long j17, boolean z17, boolean z18, int i17, boolean z19, int i18, long j18) {
        return J.N.MqTDYvZd(obj, j17, z17, z18, i17, z19, i18, j18);
    }

    public static void org_chromium_net_impl_CronetBidirectionalStream_destroy(long j17, java.lang.Object obj, boolean z17) {
        J.N.MS2l1kNx(j17, obj, z17);
    }

    public static boolean org_chromium_net_impl_CronetBidirectionalStream_readData(long j17, java.lang.Object obj, java.lang.Object obj2, int i17, int i18) {
        return J.N.Md_rPmgC(j17, obj, obj2, i17, i18);
    }

    public static void org_chromium_net_impl_CronetBidirectionalStream_sendRequestHeaders(long j17, java.lang.Object obj) {
        J.N.MGLIR7Sc(j17, obj);
    }

    public static int org_chromium_net_impl_CronetBidirectionalStream_start(long j17, java.lang.Object obj, java.lang.String str, int i17, java.lang.String str2, java.lang.String[] strArr, boolean z17) {
        return J.N.McDUim_I(j17, obj, str, i17, str2, strArr, z17);
    }

    public static boolean org_chromium_net_impl_CronetBidirectionalStream_writevData(long j17, java.lang.Object obj, java.lang.Object[] objArr, int[] iArr, int[] iArr2, boolean z17) {
        return J.N.MwJCBTMQ(j17, obj, objArr, iArr, iArr2, z17);
    }

    public static void org_chromium_net_impl_CronetLibraryLoader_cronetInitOnInitThread() {
        J.N.MROCxiBo();
    }

    public static java.lang.String org_chromium_net_impl_CronetLibraryLoader_getCronetVersion() {
        return J.N.M6xubM8G();
    }

    public static void org_chromium_net_impl_CronetLibraryLoader_setMinLogLevel(int i17) {
        J.N.Mrxu2pQS(i17);
    }

    public static long org_chromium_net_impl_CronetUploadDataStream_attachUploadDataToRequest(java.lang.Object obj, long j17, long j18) {
        return J.N.MA4X1aZa(obj, j17, j18);
    }

    public static long org_chromium_net_impl_CronetUploadDataStream_createAdapterForTesting(java.lang.Object obj) {
        return J.N.MnDEFloP_ForTesting(obj);
    }

    public static long org_chromium_net_impl_CronetUploadDataStream_createUploadDataStreamForTesting(java.lang.Object obj, long j17, long j18) {
        return J.N.MymnNC4__ForTesting(obj, j17, j18);
    }

    public static void org_chromium_net_impl_CronetUploadDataStream_destroy(long j17) {
        J.N.MMW1G0N1(j17);
    }

    public static void org_chromium_net_impl_CronetUploadDataStream_onReadSucceeded(long j17, java.lang.Object obj, int i17, boolean z17) {
        J.N.MpWH3VIr(j17, obj, i17, z17);
    }

    public static void org_chromium_net_impl_CronetUploadDataStream_onRewindSucceeded(long j17, java.lang.Object obj) {
        J.N.MFpRjSMv(j17, obj);
    }

    public static void org_chromium_net_impl_CronetUrlRequestContext_addPkp(long j17, java.lang.String str, byte[][] bArr, boolean z17, long j18) {
        J.N.Muq3ic6p(j17, str, bArr, z17, j18);
    }

    public static void org_chromium_net_impl_CronetUrlRequestContext_addQuicHint(long j17, java.lang.String str, int i17, int i18) {
        J.N.MyRIv1Ij(j17, str, i17, i18);
    }

    public static void org_chromium_net_impl_CronetUrlRequestContext_configureNetworkQualityEstimatorForTesting(long j17, java.lang.Object obj, boolean z17, boolean z18, boolean z19) {
        J.N.M6sIJDgy_ForTesting(j17, obj, z17, z18, z19);
    }

    public static long org_chromium_net_impl_CronetUrlRequestContext_createRequestContextAdapter(long j17) {
        return J.N.M135Cu0D(j17);
    }

    public static long org_chromium_net_impl_CronetUrlRequestContext_createRequestContextConfig(byte[] bArr) {
        return J.N.MB3ntV7V(bArr);
    }

    public static void org_chromium_net_impl_CronetUrlRequestContext_destroy(long j17, java.lang.Object obj) {
        J.N.MeBvNXm5(j17, obj);
    }

    public static boolean org_chromium_net_impl_CronetUrlRequestContext_getEnableTelemetry(long j17, java.lang.Object obj) {
        return J.N.MjAZnhE4(j17, obj);
    }

    public static byte[] org_chromium_net_impl_CronetUrlRequestContext_getHistogramDeltas() {
        return J.N.M7CZ_Klr();
    }

    public static void org_chromium_net_impl_CronetUrlRequestContext_initRequestContextOnInitThread(long j17, java.lang.Object obj) {
        J.N.M6Dz0nZ5(j17, obj);
    }

    public static void org_chromium_net_impl_CronetUrlRequestContext_provideRTTObservations(long j17, java.lang.Object obj, boolean z17) {
        J.N.MpnFLFF2(j17, obj, z17);
    }

    public static void org_chromium_net_impl_CronetUrlRequestContext_provideThroughputObservations(long j17, java.lang.Object obj, boolean z17) {
        J.N.MnPUhNKP(j17, obj, z17);
    }

    public static void org_chromium_net_impl_CronetUrlRequestContext_startNetLogToDisk(long j17, java.lang.Object obj, java.lang.String str, boolean z17, int i17) {
        J.N.MTULt02u(j17, obj, str, z17, i17);
    }

    public static boolean org_chromium_net_impl_CronetUrlRequestContext_startNetLogToFile(long j17, java.lang.Object obj, java.lang.String str, boolean z17) {
        return J.N.MgwJQAH1(j17, obj, str, z17);
    }

    public static void org_chromium_net_impl_CronetUrlRequestContext_stopNetLog(long j17, java.lang.Object obj) {
        J.N.MKFm_qQ7(j17, obj);
    }

    public static boolean org_chromium_net_impl_CronetUrlRequest_addRequestHeader(long j17, java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        return J.N.MvHusd1J(j17, obj, str, str2);
    }

    public static long org_chromium_net_impl_CronetUrlRequest_createRequestAdapter(java.lang.Object obj, long j17, java.lang.String str, int i17, boolean z17, boolean z18, boolean z19, int i18, boolean z27, int i19, int i27, long j18) {
        return J.N.MuOIsMvf(obj, j17, str, i17, z17, z18, z19, i18, z27, i19, i27, j18);
    }

    public static void org_chromium_net_impl_CronetUrlRequest_destroy(long j17, java.lang.Object obj, boolean z17) {
        J.N.M4znfYdB(j17, obj, z17);
    }

    public static void org_chromium_net_impl_CronetUrlRequest_followDeferredRedirect(long j17, java.lang.Object obj) {
        J.N.Mhp54Oqs(j17, obj);
    }

    public static void org_chromium_net_impl_CronetUrlRequest_getStatus(long j17, java.lang.Object obj, java.lang.Object obj2) {
        J.N.MgIIMpT9(j17, obj, obj2);
    }

    public static boolean org_chromium_net_impl_CronetUrlRequest_readData(long j17, java.lang.Object obj, java.lang.Object obj2, int i17, int i18) {
        return J.N.MfCxA8r3(j17, obj, obj2, i17, i18);
    }

    public static boolean org_chromium_net_impl_CronetUrlRequest_setHttpMethod(long j17, java.lang.Object obj, java.lang.String str) {
        return J.N.M51RPBJe(j17, obj, str);
    }

    public static void org_chromium_net_impl_CronetUrlRequest_start(long j17, java.lang.Object obj) {
        J.N.MabZ5m6r(j17, obj);
    }

    public static void org_chromium_net_mm_CronetJsBinding_cancelAllRequests(long j17) {
        J.N.MTHIRrV3(j17);
    }

    public static void org_chromium_net_mm_CronetJsBinding_destroy(long j17) {
        J.N.Mr2MmWUZ(j17);
    }

    public static long org_chromium_net_mm_CronetJsBinding_initCronetJsBinding(java.lang.Object obj, long j17, long j18, long j19) {
        return J.N.MsmDK0Nf(obj, j17, j18, j19);
    }

    public static void org_chromium_net_mm_CronetJsBinding_setupConfig(long j17, java.lang.String str, java.lang.String str2, long j18, long j19, long j27, long j28, java.lang.String str3, boolean z17) {
        J.N.MHxUAYRd(j17, str, str2, j18, j19, j27, j28, str3, z17);
    }

    public static void org_chromium_net_mm_CronetJsBinding_setupMemoryPressureListener() {
        J.N.MQhpfJji();
    }
}
