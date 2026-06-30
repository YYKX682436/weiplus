package ix3;

/* loaded from: classes.dex */
public final class v0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f295580d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ix3.y0 f295581e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(ix3.y0 y0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f295581e = y0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        ix3.v0 v0Var = new ix3.v0(this.f295581e, continuation);
        v0Var.f295580d = obj;
        return v0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ix3.v0 v0Var = (ix3.v0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        v0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        jz5.l lVar;
        r45.dp5 dp5Var;
        java.util.LinkedList list;
        r45.dp5 dp5Var2;
        ix3.y0 y0Var;
        java.util.HashMap hashMap;
        java.util.Iterator it;
        java.lang.Object obj2;
        java.util.HashMap hashMap2;
        java.lang.Class cls;
        q55.g gVar;
        j75.f stateCenter;
        com.tencent.mm.sdk.coroutines.LifecycleScope O6;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        s55.a aVar2 = com.tencent.mm.repairer.config.debugger.RepairerConfigAssistNetworkProxy.f192210a;
        ((java.util.ArrayList) com.tencent.mm.repairer.config.debugger.RepairerConfigAssistNetworkProxy.f192211b).clear();
        ((java.util.ArrayList) com.tencent.mm.repairer.config.debugger.RepairerConfigAssistNetworkProxy.f192212c).clear();
        java.util.Set set = ix3.y0.f295611d;
        ((java.util.Map) ((jz5.n) ix3.y0.f295613f).getValue()).forEach(ix3.s0.f295550a);
        r45.dp5 dp5Var3 = new r45.dp5();
        ix3.y0 y0Var2 = this.f295581e;
        byte[] byteArrayExtra = y0Var2.getIntent().getByteArrayExtra("key_config_item_list");
        int i17 = 1;
        if (byteArrayExtra == null || dp5Var3.fromProtobuf(byteArrayExtra) == null) {
            y0Var2.getClass();
            r45.dp5 dp5Var4 = new r45.dp5();
            java.util.HashMap hashMap3 = new java.util.HashMap();
            java.util.Iterator it6 = ((ew3.a) ((ew3.c) ((jz5.n) ew3.e.f257064a).getValue())).a("defaultType").iterator();
            while (it6.hasNext()) {
                java.lang.Class cls2 = (java.lang.Class) it6.next();
                java.lang.Object newInstance = cls2.getConstructors()[0].newInstance(new java.lang.Object[0]);
                if (newInstance instanceof q55.g) {
                    q55.g gVar2 = (q55.g) newInstance;
                    r45.dp5 dp5Var5 = kotlin.jvm.internal.o.b(gVar2.e(), cls2) ? dp5Var4 : new r45.dp5();
                    dp5Var5.set(0, gVar2.b());
                    dp5Var5.set(i17, gVar2.c());
                    dp5Var5.set(2, java.lang.Integer.valueOf(i17));
                    dp5Var5.set(7, java.lang.Integer.valueOf(gVar2.g()));
                    dp5Var5.set(11, java.lang.Integer.valueOf(gVar2.d()));
                    if (newInstance instanceof com.tencent.mm.repairer.group.RepairerGroupSns) {
                        java.util.LinkedList list2 = dp5Var5.getList(5);
                        com.tencent.mm.repairer.group.RepairerGroupSns repairerGroupSns = (com.tencent.mm.repairer.group.RepairerGroupSns) newInstance;
                        repairerGroupSns.getClass();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        r45.dp5 dp5Var6 = new r45.dp5();
                        dp5Var6.set(0, "RepairerGroup_OldMedia");
                        dp5Var6.set(i17, "视频拍摄编辑");
                        dp5Var6.set(2, java.lang.Integer.valueOf(i17));
                        java.util.LinkedList list3 = dp5Var6.getList(5);
                        r45.dp5 dp5Var7 = new r45.dp5();
                        dp5Var7.set(0, "RepairerGroup_OldCamera");
                        dp5Var7.set(1, "相机配置");
                        dp5Var7.set(2, 1);
                        java.util.LinkedList list4 = dp5Var7.getList(5);
                        r45.dp5 dp5Var8 = new r45.dp5();
                        it = it6;
                        dp5Var8.set(0, "RepairerConfig_Camera_Component_Int");
                        dp5Var8.set(1, "Camera组件选择");
                        y0Var = y0Var2;
                        dp5Var8.set(2, 3);
                        java.util.LinkedList list5 = dp5Var8.getList(3);
                        kotlin.jvm.internal.o.f(list5, "getValues(...)");
                        dp5Var2 = dp5Var4;
                        hashMap2 = hashMap3;
                        cls = cls2;
                        kz5.h0.w(list5, new java.lang.String[]{"0", "1", "2"});
                        java.util.LinkedList list6 = dp5Var8.getList(6);
                        kotlin.jvm.internal.o.f(list6, "getValueAlias(...)");
                        gVar = gVar2;
                        r45.dp5 dp5Var9 = dp5Var5;
                        kz5.h0.w(list6, new java.lang.String[]{"默认", "现网版本", "CameraKit"});
                        list4.add(dp5Var8);
                        java.util.LinkedList list7 = dp5Var7.getList(5);
                        r45.dp5 dp5Var10 = new r45.dp5();
                        dp5Var10.set(0, "RepairerConfig_Camera_Debug_Int");
                        dp5Var10.set(1, "CameraKit debug开关");
                        dp5Var10.set(2, 3);
                        java.util.LinkedList list8 = dp5Var10.getList(3);
                        kotlin.jvm.internal.o.f(list8, "getValues(...)");
                        kz5.h0.w(list8, new java.lang.String[]{"0", "1"});
                        java.util.LinkedList list9 = dp5Var10.getList(6);
                        kotlin.jvm.internal.o.f(list9, "getValueAlias(...)");
                        kz5.h0.w(list9, new java.lang.String[]{"关闭", "打开"});
                        list7.add(dp5Var10);
                        java.util.LinkedList list10 = dp5Var7.getList(5);
                        r45.dp5 dp5Var11 = new r45.dp5();
                        dp5Var11.set(0, "RepairerConfig_Camera_Instance_Int");
                        dp5Var11.set(1, "CameraKit相机实例");
                        dp5Var11.set(2, 3);
                        java.util.LinkedList list11 = dp5Var11.getList(3);
                        kotlin.jvm.internal.o.f(list11, "getValues(...)");
                        kz5.h0.w(list11, new java.lang.String[]{"0", "1", "2", "3"});
                        java.util.LinkedList list12 = dp5Var11.getList(6);
                        kotlin.jvm.internal.o.f(list12, "getValueAlias(...)");
                        kz5.h0.w(list12, new java.lang.String[]{"默认", "camera1", "camera2", "camerax"});
                        list10.add(dp5Var11);
                        java.util.LinkedList list13 = dp5Var7.getList(5);
                        r45.dp5 dp5Var12 = new r45.dp5();
                        dp5Var12.set(0, "RepairerConfig_Camera1_Preview_Int");
                        dp5Var12.set(1, "camera1预览方式");
                        dp5Var12.set(2, 3);
                        java.util.LinkedList list14 = dp5Var12.getList(3);
                        kotlin.jvm.internal.o.f(list14, "getValues(...)");
                        kz5.h0.w(list14, new java.lang.String[]{"0", "1", "2"});
                        java.util.LinkedList list15 = dp5Var12.getList(6);
                        kotlin.jvm.internal.o.f(list15, "getValueAlias(...)");
                        kz5.h0.w(list15, new java.lang.String[]{"后台配置", "纹理", "buffer"});
                        list13.add(dp5Var12);
                        java.util.LinkedList list16 = dp5Var7.getList(5);
                        r45.dp5 dp5Var13 = new r45.dp5();
                        dp5Var13.set(0, "RepairerConfig_Camerax_Picture_Int");
                        dp5Var13.set(1, "camerax拍照方式");
                        dp5Var13.set(2, 3);
                        java.util.LinkedList list17 = dp5Var13.getList(3);
                        kotlin.jvm.internal.o.f(list17, "getValues(...)");
                        kz5.h0.w(list17, new java.lang.String[]{"0", "1", "2"});
                        java.util.LinkedList list18 = dp5Var13.getList(6);
                        kotlin.jvm.internal.o.f(list18, "getValueAlias(...)");
                        kz5.h0.w(list18, new java.lang.String[]{"后台配置", "readPixel", "ImageCapture"});
                        list16.add(dp5Var13);
                        java.util.LinkedList list19 = dp5Var7.getList(5);
                        r45.dp5 dp5Var14 = new r45.dp5();
                        dp5Var14.set(0, "RepairerConfig_Camera_Performance_Int");
                        dp5Var14.set(1, "camera渲染glFinish");
                        dp5Var14.set(2, 3);
                        java.util.LinkedList list20 = dp5Var14.getList(3);
                        kotlin.jvm.internal.o.f(list20, "getValues(...)");
                        kz5.h0.w(list20, new java.lang.String[]{"0", "1", "2"});
                        java.util.LinkedList list21 = dp5Var14.getList(6);
                        kotlin.jvm.internal.o.f(list21, "getValueAlias(...)");
                        kz5.h0.w(list21, new java.lang.String[]{"默认", "关", "开"});
                        list19.add(dp5Var14);
                        java.util.LinkedList list22 = dp5Var7.getList(5);
                        r45.dp5 dp5Var15 = new r45.dp5();
                        dp5Var15.set(0, "RepairerConfig_Camerax_Extension_Int");
                        dp5Var15.set(1, "camerax能力配置");
                        dp5Var15.set(2, 3);
                        java.util.LinkedList list23 = dp5Var15.getList(3);
                        kotlin.jvm.internal.o.f(list23, "getValues(...)");
                        kz5.h0.w(list23, new java.lang.String[]{"0", "1", "2", "3", "4", "5"});
                        java.util.LinkedList list24 = dp5Var15.getList(6);
                        kotlin.jvm.internal.o.f(list24, "getValueAlias(...)");
                        kz5.h0.w(list24, new java.lang.String[]{"None", "背景虚化", "HDR", "夜景", "美颜", "自动"});
                        list22.add(dp5Var15);
                        java.util.LinkedList list25 = dp5Var7.getList(5);
                        r45.dp5 dp5Var16 = new r45.dp5();
                        dp5Var16.set(0, "RepairerConfig_Camera_CameraKitIsUseImproveILayout_Int");
                        dp5Var16.set(1, "新版拍摄页面");
                        dp5Var16.set(2, 3);
                        java.util.LinkedList list26 = dp5Var16.getList(3);
                        kotlin.jvm.internal.o.f(list26, "getValues(...)");
                        kz5.h0.w(list26, new java.lang.String[]{"0", "1", "2", "3", "4", "5"});
                        java.util.LinkedList list27 = dp5Var16.getList(6);
                        kotlin.jvm.internal.o.f(list27, "getValueAlias(...)");
                        kz5.h0.w(list27, new java.lang.String[]{"x实验", "新功能页面", "屏蔽方案页面", "专业拍摄界面(flash)", "专业拍摄界面(torch)", "关闭"});
                        list25.add(dp5Var16);
                        java.util.LinkedList list28 = dp5Var7.getList(5);
                        r45.dp5 dp5Var17 = new r45.dp5();
                        dp5Var17.set(0, "RepairerConfig_Camera_CameraKitImproveInstance_Int");
                        dp5Var17.set(1, "新版拍摄页面使用相机实例");
                        dp5Var17.set(2, 3);
                        java.util.LinkedList list29 = dp5Var17.getList(3);
                        kotlin.jvm.internal.o.f(list29, "getValues(...)");
                        kz5.h0.w(list29, new java.lang.String[]{"0", "1", "2", "3"});
                        java.util.LinkedList list30 = dp5Var17.getList(6);
                        kotlin.jvm.internal.o.f(list30, "getValueAlias(...)");
                        kz5.h0.w(list30, new java.lang.String[]{"x实验", "camera1", "camera2（未实现）", "cameraX"});
                        list28.add(dp5Var17);
                        list3.add(dp5Var7);
                        java.util.LinkedList list31 = dp5Var6.getList(5);
                        r45.dp5 dp5Var18 = new r45.dp5();
                        dp5Var18.set(0, "RepairerConfig_MediaParallel_SaveVideo_Int");
                        dp5Var18.set(1, "长视频转码视频强制保存相册");
                        dp5Var18.set(2, 3);
                        java.util.LinkedList list32 = dp5Var18.getList(3);
                        kotlin.jvm.internal.o.f(list32, "getValues(...)");
                        kz5.h0.w(list32, new java.lang.String[]{"0", "1"});
                        java.util.LinkedList list33 = dp5Var18.getList(6);
                        kotlin.jvm.internal.o.f(list33, "getValueAlias(...)");
                        kz5.h0.w(list33, new java.lang.String[]{"关闭", "打开"});
                        list31.add(dp5Var18);
                        java.util.LinkedList list34 = dp5Var6.getList(5);
                        r45.dp5 dp5Var19 = new r45.dp5();
                        dp5Var19.set(0, "RepairerConfig_MediaParallel_NotSupport_Int");
                        dp5Var19.set(1, "视频号转码并行段数");
                        dp5Var19.set(2, 3);
                        java.util.LinkedList list35 = dp5Var19.getList(3);
                        kotlin.jvm.internal.o.f(list35, "getValues(...)");
                        kz5.h0.w(list35, new java.lang.String[]{"-1", "0", "1", "2", "3", "4", "99"});
                        list34.add(dp5Var19);
                        java.util.LinkedList list36 = dp5Var6.getList(5);
                        r45.dp5 dp5Var20 = new r45.dp5();
                        dp5Var20.set(0, "RepairerConfig_Media_CaptureSoft_Int");
                        dp5Var20.set(1, "c2c/sns拍摄开启使用软编(0:Default/1:开启/2:关闭)");
                        dp5Var20.set(2, 3);
                        java.util.LinkedList list37 = dp5Var20.getList(3);
                        kotlin.jvm.internal.o.f(list37, "getValues(...)");
                        kz5.h0.w(list37, new java.lang.String[]{"0", "1", "2"});
                        list36.add(dp5Var20);
                        java.util.LinkedList list38 = dp5Var6.getList(5);
                        r45.dp5 dp5Var21 = new r45.dp5();
                        dp5Var21.set(0, "RepairerConfig_Media_PlayDolbyVideo_Int");
                        dp5Var21.set(1, "c2c视频播放支持dolby");
                        dp5Var21.set(2, 3);
                        java.util.LinkedList list39 = dp5Var21.getList(3);
                        kotlin.jvm.internal.o.f(list39, "getValues(...)");
                        kz5.h0.w(list39, new java.lang.String[]{"0", "1"});
                        java.util.LinkedList list40 = dp5Var21.getList(6);
                        kotlin.jvm.internal.o.f(list40, "getValueAlias(...)");
                        kz5.h0.w(list40, new java.lang.String[]{"关闭", "打开"});
                        list38.add(dp5Var21);
                        java.util.LinkedList list41 = dp5Var6.getList(5);
                        r45.dp5 dp5Var22 = new r45.dp5();
                        dp5Var22.set(0, "RepairerConfig_Media_CompositionUseLut_Int");
                        dp5Var22.set(1, "c2c hdr视频转码使用lut");
                        dp5Var22.set(2, 3);
                        java.util.LinkedList list42 = dp5Var22.getList(3);
                        kotlin.jvm.internal.o.f(list42, "getValues(...)");
                        kz5.h0.w(list42, new java.lang.String[]{"0", "1"});
                        java.util.LinkedList list43 = dp5Var22.getList(6);
                        kotlin.jvm.internal.o.f(list43, "getValueAlias(...)");
                        kz5.h0.w(list43, new java.lang.String[]{"关闭", "打开"});
                        list41.add(dp5Var22);
                        java.util.LinkedList list44 = dp5Var6.getList(5);
                        r45.dp5 dp5Var23 = new r45.dp5();
                        dp5Var23.set(0, "RepairerConfig_Media_CaptureCpuCrop_Int");
                        dp5Var23.set(1, "c2c/sns拍摄开启使用CpuCrop(0:Default/1:开启/2:关闭)");
                        dp5Var23.set(2, 3);
                        java.util.LinkedList list45 = dp5Var23.getList(3);
                        kotlin.jvm.internal.o.f(list45, "getValues(...)");
                        kz5.h0.w(list45, new java.lang.String[]{"0", "1", "2"});
                        list44.add(dp5Var23);
                        java.util.LinkedList list46 = dp5Var6.getList(5);
                        r45.dp5 dp5Var24 = new r45.dp5();
                        dp5Var24.set(0, "RepairerConfig_Media_C2CGallerySelectLimit_Int");
                        dp5Var24.set(1, "c2c 相册选择数量限制");
                        dp5Var24.set(2, 3);
                        java.util.LinkedList list47 = dp5Var24.getList(3);
                        kotlin.jvm.internal.o.f(list47, "getValues(...)");
                        kz5.h0.w(list47, new java.lang.String[]{"9", "12", "15", "18", "99"});
                        list46.add(dp5Var24);
                        java.util.LinkedList list48 = dp5Var6.getList(5);
                        r45.dp5 dp5Var25 = new r45.dp5();
                        dp5Var25.set(0, "RepairerConfig_Media_CaptureHevc_Int");
                        dp5Var25.set(1, "c2c/sns拍摄开启hevc(0:Default/1:软编/2:硬编)");
                        dp5Var25.set(2, 3);
                        java.util.LinkedList list49 = dp5Var25.getList(3);
                        kotlin.jvm.internal.o.f(list49, "getValues(...)");
                        kz5.h0.w(list49, new java.lang.String[]{"0", "1", "2"});
                        list48.add(dp5Var25);
                        java.util.LinkedList list50 = dp5Var6.getList(5);
                        r45.dp5 dp5Var26 = new r45.dp5();
                        dp5Var26.set(0, "RepairerConfig_Media_RemuxHevc_Int");
                        dp5Var26.set(1, "c2c/sns重编码开启hevc(不包括c2c相册选视频)(0:Default/1:软编/2:硬编)");
                        dp5Var26.set(2, 3);
                        java.util.LinkedList list51 = dp5Var26.getList(3);
                        kotlin.jvm.internal.o.f(list51, "getValues(...)");
                        kz5.h0.w(list51, new java.lang.String[]{"0", "1", "2"});
                        list50.add(dp5Var26);
                        java.util.LinkedList list52 = dp5Var6.getList(5);
                        r45.dp5 dp5Var27 = new r45.dp5();
                        dp5Var27.set(0, "RepairerConfig_Media_ImportVideoBRRatio_Float");
                        dp5Var27.set(1, "软编压缩HEVC视频码率比例参数");
                        dp5Var27.set(2, 3);
                        java.util.LinkedList list53 = dp5Var27.getList(3);
                        kotlin.jvm.internal.o.f(list53, "getValues(...)");
                        kz5.h0.w(list53, new java.lang.String[]{"0.7", "0.8", "0.9", "1.0", "1.1", "1.2", "1.3", "1.4", "1.5", "1.7", "1.9", "2.0"});
                        list52.add(dp5Var27);
                        java.util.LinkedList list54 = dp5Var6.getList(5);
                        r45.dp5 dp5Var28 = new r45.dp5();
                        dp5Var28.set(0, "RepairerConfig_Media_ImportVideoHEVC_ABR_Int");
                        dp5Var28.set(1, "c2c相册选视频HEVC软编使用恒定码率模式");
                        dp5Var28.set(2, 3);
                        java.util.LinkedList list55 = dp5Var28.getList(3);
                        kotlin.jvm.internal.o.f(list55, "getValues(...)");
                        kz5.h0.w(list55, new java.lang.String[]{"0", "5", "11", "16", "17"});
                        list54.add(dp5Var28);
                        java.util.LinkedList list56 = dp5Var6.getList(5);
                        r45.dp5 dp5Var29 = new r45.dp5();
                        dp5Var29.set(0, "RepairerConfig_Media_ImportVideoHEVC_CRF_Int");
                        dp5Var29.set(1, "c2c相册选视频HEVC软编使用恒定质量模式");
                        dp5Var29.set(2, 3);
                        java.util.LinkedList list57 = dp5Var29.getList(3);
                        kotlin.jvm.internal.o.f(list57, "getValues(...)");
                        kz5.h0.w(list57, new java.lang.String[]{"0", "12", "13", "14", "15"});
                        list56.add(dp5Var29);
                        java.util.LinkedList list58 = dp5Var6.getList(5);
                        r45.dp5 dp5Var30 = new r45.dp5();
                        dp5Var30.set(0, "RepairerConfig_Media_ImportVideoHEVCCRFRatio_Float");
                        dp5Var30.set(1, "软编压缩HEVC视频恒定质量模式CRF调整参数");
                        dp5Var30.set(2, 3);
                        java.util.LinkedList list59 = dp5Var30.getList(3);
                        kotlin.jvm.internal.o.f(list59, "getValues(...)");
                        kz5.h0.w(list59, new java.lang.String[]{"0", "-1", "-2", "-3", "-4", "1", "2", "3", "4"});
                        list58.add(dp5Var30);
                        java.util.LinkedList list60 = dp5Var6.getList(5);
                        r45.dp5 dp5Var31 = new r45.dp5();
                        dp5Var31.set(0, "RepairerConfig_Media_ImportConstBRRatioMode_Float");
                        dp5Var31.set(1, "存量视频--压缩非原视频是否使用恒定比例码率模式");
                        dp5Var31.set(2, 3);
                        dp5Var31.set(8, androidx.camera.core.processing.util.GLUtils.VERSION_UNKNOWN);
                        java.util.LinkedList list61 = dp5Var31.getList(3);
                        kotlin.jvm.internal.o.f(list61, "getValues(...)");
                        kz5.h0.w(list61, new java.lang.String[]{"0", "0.5", "0.6", "0.7", "0.8", "0.9", "1"});
                        list60.add(dp5Var31);
                        java.util.LinkedList list62 = dp5Var6.getList(5);
                        r45.dp5 dp5Var32 = new r45.dp5();
                        dp5Var32.set(0, "RepairerConfig_Media_ImportVideoRemuxHevc_Int");
                        dp5Var32.set(1, "c2c相册选视频开启hevc(0:Default/1:软编)");
                        dp5Var32.set(2, 3);
                        java.util.LinkedList list63 = dp5Var32.getList(3);
                        kotlin.jvm.internal.o.f(list63, "getValues(...)");
                        kz5.h0.w(list63, new java.lang.String[]{"0", "1", "2"});
                        list62.add(dp5Var32);
                        java.util.LinkedList list64 = dp5Var6.getList(5);
                        r45.dp5 dp5Var33 = new r45.dp5();
                        dp5Var33.set(0, "RepairerConfig_Media_ImportVideoUseComposition_Int");
                        dp5Var33.set(1, "c2c相册选视频发送使用video_composition转码");
                        dp5Var33.set(2, 3);
                        java.util.LinkedList list65 = dp5Var33.getList(3);
                        kotlin.jvm.internal.o.f(list65, "getValues(...)");
                        kz5.h0.w(list65, new java.lang.String[]{"0", "1", "2"});
                        java.util.LinkedList list66 = dp5Var33.getList(6);
                        kotlin.jvm.internal.o.f(list66, "getValueAlias(...)");
                        kz5.h0.w(list66, new java.lang.String[]{"默认", "打开", "关闭"});
                        list64.add(dp5Var33);
                        java.util.LinkedList list67 = dp5Var6.getList(5);
                        r45.dp5 dp5Var34 = new r45.dp5();
                        dp5Var34.set(0, "RepairerConfig_Media_AvcEncodeHard_Int");
                        dp5Var34.set(1, "c2c相册选视频发送264使用硬编转码");
                        dp5Var34.set(2, 3);
                        java.util.LinkedList list68 = dp5Var34.getList(3);
                        kotlin.jvm.internal.o.f(list68, "getValues(...)");
                        kz5.h0.w(list68, new java.lang.String[]{"0", "1", "2"});
                        java.util.LinkedList list69 = dp5Var34.getList(6);
                        kotlin.jvm.internal.o.f(list69, "getValueAlias(...)");
                        kz5.h0.w(list69, new java.lang.String[]{"默认", "打开", "关闭"});
                        list67.add(dp5Var34);
                        java.util.LinkedList list70 = dp5Var6.getList(5);
                        r45.dp5 dp5Var35 = new r45.dp5();
                        dp5Var35.set(0, "RepairerConfig_Media_CaptureCropCameraTexture_Int");
                        dp5Var35.set(1, "拍摄视频直接裁剪camera纹理");
                        dp5Var35.set(2, 3);
                        java.util.LinkedList list71 = dp5Var35.getList(3);
                        kotlin.jvm.internal.o.f(list71, "getValues(...)");
                        kz5.h0.w(list71, new java.lang.String[]{"0", "1", "2"});
                        java.util.LinkedList list72 = dp5Var35.getList(6);
                        kotlin.jvm.internal.o.f(list72, "getValueAlias(...)");
                        kz5.h0.w(list72, new java.lang.String[]{"默认", "打开", "关闭"});
                        list70.add(dp5Var35);
                        java.util.LinkedList list73 = dp5Var6.getList(5);
                        r45.dp5 dp5Var36 = new r45.dp5();
                        dp5Var36.set(0, "RepairerConfig_Media_CleanFile_Int");
                        dp5Var36.set(1, "视频缓存文件清理时间周期");
                        dp5Var36.set(2, 3);
                        java.util.LinkedList list74 = dp5Var36.getList(3);
                        kotlin.jvm.internal.o.f(list74, "getValues(...)");
                        kz5.h0.w(list74, new java.lang.String[]{"0", "1"});
                        java.util.LinkedList list75 = dp5Var36.getList(6);
                        kotlin.jvm.internal.o.f(list75, "getValueAlias(...)");
                        kz5.h0.w(list75, new java.lang.String[]{"默认14天", "每次都检查"});
                        list73.add(dp5Var36);
                        java.util.LinkedList list76 = dp5Var6.getList(5);
                        r45.dp5 dp5Var37 = new r45.dp5();
                        dp5Var37.set(0, "RepairerConfig_Media_AppbrandUseMMrecord_Int");
                        dp5Var37.set(1, "小程序使用新拍摄器");
                        dp5Var37.set(2, 3);
                        java.util.LinkedList list77 = dp5Var37.getList(3);
                        kotlin.jvm.internal.o.f(list77, "getValues(...)");
                        kz5.h0.w(list77, new java.lang.String[]{"0", "1"});
                        java.util.LinkedList list78 = dp5Var37.getList(6);
                        kotlin.jvm.internal.o.f(list78, "getValueAlias(...)");
                        kz5.h0.w(list78, new java.lang.String[]{"否", "是"});
                        list76.add(dp5Var37);
                        java.util.LinkedList list79 = dp5Var6.getList(5);
                        r45.dp5 dp5Var38 = new r45.dp5();
                        dp5Var38.set(0, "RepairerConfig_Media_C2CRecordUseVideoComposition_Int");
                        dp5Var38.set(1, "c2c拍摄视频使用VideoComposition");
                        dp5Var38.set(2, 3);
                        java.util.LinkedList list80 = dp5Var38.getList(3);
                        kotlin.jvm.internal.o.f(list80, "getValues(...)");
                        kz5.h0.w(list80, new java.lang.String[]{"0", "1", "2"});
                        java.util.LinkedList list81 = dp5Var38.getList(6);
                        kotlin.jvm.internal.o.f(list81, "getValueAlias(...)");
                        kz5.h0.w(list81, new java.lang.String[]{"默认", "关闭", "打开"});
                        list79.add(dp5Var38);
                        java.util.LinkedList list82 = dp5Var6.getList(5);
                        r45.dp5 dp5Var39 = new r45.dp5();
                        dp5Var39.set(0, "RepairerConfig_Media_SnsRecordUseVideoComposition_Int");
                        dp5Var39.set(1, "sns拍摄视频使用VideoComposition");
                        dp5Var39.set(2, 3);
                        java.util.LinkedList list83 = dp5Var39.getList(3);
                        kotlin.jvm.internal.o.f(list83, "getValues(...)");
                        kz5.h0.w(list83, new java.lang.String[]{"0", "1", "2"});
                        java.util.LinkedList list84 = dp5Var39.getList(6);
                        kotlin.jvm.internal.o.f(list84, "getValueAlias(...)");
                        kz5.h0.w(list84, new java.lang.String[]{"默认", "打开", "关闭"});
                        list82.add(dp5Var39);
                        java.util.LinkedList list85 = dp5Var6.getList(5);
                        r45.dp5 dp5Var40 = new r45.dp5();
                        dp5Var40.set(0, "RepairerConfig_Media_SnsAlbumUseVideoComposition_Int");
                        dp5Var40.set(1, "sns相册选择视频编辑使用VideoComposition");
                        dp5Var40.set(2, 3);
                        java.util.LinkedList list86 = dp5Var40.getList(3);
                        kotlin.jvm.internal.o.f(list86, "getValues(...)");
                        kz5.h0.w(list86, new java.lang.String[]{"0", "1", "2"});
                        java.util.LinkedList list87 = dp5Var40.getList(6);
                        kotlin.jvm.internal.o.f(list87, "getValueAlias(...)");
                        kz5.h0.w(list87, new java.lang.String[]{"默认", "打开", "关闭"});
                        list85.add(dp5Var40);
                        java.util.LinkedList list88 = dp5Var6.getList(5);
                        r45.dp5 dp5Var41 = new r45.dp5();
                        dp5Var41.set(0, "RepairerConfig_Media_SnsRecordBackgroundRemux_Int");
                        dp5Var41.set(1, "sns拍摄视频使用后台合成");
                        dp5Var41.set(2, 3);
                        java.util.LinkedList list89 = dp5Var41.getList(3);
                        kotlin.jvm.internal.o.f(list89, "getValues(...)");
                        kz5.h0.w(list89, new java.lang.String[]{"0", "1", "2"});
                        java.util.LinkedList list90 = dp5Var41.getList(6);
                        kotlin.jvm.internal.o.f(list90, "getValueAlias(...)");
                        kz5.h0.w(list90, new java.lang.String[]{"默认", "打开", "关闭"});
                        list88.add(dp5Var41);
                        java.util.LinkedList list91 = dp5Var6.getList(5);
                        r45.dp5 dp5Var42 = new r45.dp5();
                        dp5Var42.set(0, "RepairerConfig_Media_SnsAlbumBackgroundRemux_Int");
                        dp5Var42.set(1, "sns相册选择视频使用后台合成");
                        dp5Var42.set(2, 3);
                        java.util.LinkedList list92 = dp5Var42.getList(3);
                        kotlin.jvm.internal.o.f(list92, "getValues(...)");
                        kz5.h0.w(list92, new java.lang.String[]{"0", "1", "2"});
                        java.util.LinkedList list93 = dp5Var42.getList(6);
                        kotlin.jvm.internal.o.f(list93, "getValueAlias(...)");
                        kz5.h0.w(list93, new java.lang.String[]{"默认", "打开", "关闭"});
                        list91.add(dp5Var42);
                        java.util.LinkedList list94 = dp5Var6.getList(5);
                        r45.dp5 dp5Var43 = new r45.dp5();
                        dp5Var43.set(0, "RepairerConfig_Media_SnsBackgroundRemuxError_Int");
                        dp5Var43.set(1, "sns后台合成hardcode失败");
                        dp5Var43.set(2, 3);
                        java.util.LinkedList list95 = dp5Var43.getList(3);
                        kotlin.jvm.internal.o.f(list95, "getValues(...)");
                        kz5.h0.w(list95, new java.lang.String[]{"0", "1"});
                        java.util.LinkedList list96 = dp5Var43.getList(6);
                        kotlin.jvm.internal.o.f(list96, "getValueAlias(...)");
                        kz5.h0.w(list96, new java.lang.String[]{"关闭", "打开"});
                        list94.add(dp5Var43);
                        java.util.LinkedList list97 = dp5Var6.getList(5);
                        r45.dp5 dp5Var44 = new r45.dp5();
                        dp5Var44.set(0, "RepairerConfig_Media_SNSVC_Int");
                        dp5Var44.set(1, "朋友圈使用composition编辑");
                        dp5Var44.set(2, 3);
                        java.util.LinkedList list98 = dp5Var44.getList(3);
                        kotlin.jvm.internal.o.f(list98, "getValues(...)");
                        kz5.h0.w(list98, new java.lang.String[]{"-1", "0", "1"});
                        java.util.LinkedList list99 = dp5Var44.getList(6);
                        kotlin.jvm.internal.o.f(list99, "getValueAlias(...)");
                        kz5.h0.w(list99, new java.lang.String[]{"默认", "否", "是"});
                        list97.add(dp5Var44);
                        java.util.LinkedList list100 = dp5Var6.getList(5);
                        r45.dp5 dp5Var45 = new r45.dp5();
                        dp5Var45.set(0, "RepairerConfig_Media_C2CVideoReTransmitUseLink_Int");
                        dp5Var45.set(1, "聊天视频主动转发使用link");
                        dp5Var45.set(2, 3);
                        java.util.LinkedList list101 = dp5Var45.getList(3);
                        kotlin.jvm.internal.o.f(list101, "getValues(...)");
                        kz5.h0.w(list101, new java.lang.String[]{"0", "1", "2"});
                        java.util.LinkedList list102 = dp5Var45.getList(6);
                        kotlin.jvm.internal.o.f(list102, "getValueAlias(...)");
                        kz5.h0.w(list102, new java.lang.String[]{"默认", "打开", "关闭"});
                        list100.add(dp5Var45);
                        java.util.LinkedList list103 = dp5Var6.getList(5);
                        r45.dp5 dp5Var46 = new r45.dp5();
                        dp5Var46.set(0, "RepairerConfig_Media_VideoSoftEncodeFixedResolution_Int");
                        dp5Var46.set(1, "composition编辑软编导出对齐9:16");
                        dp5Var46.set(2, 3);
                        java.util.LinkedList list104 = dp5Var46.getList(3);
                        kotlin.jvm.internal.o.f(list104, "getValues(...)");
                        kz5.h0.w(list104, new java.lang.String[]{"0", "2", "4", "6", "8", com.tenpay.android.wechat.PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT, "-1"});
                        java.util.LinkedList list105 = dp5Var46.getList(6);
                        kotlin.jvm.internal.o.f(list105, "getValueAlias(...)");
                        kz5.h0.w(list105, new java.lang.String[]{"默认", "2", "4", "6", "8", com.tenpay.android.wechat.PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT, "关闭"});
                        list103.add(dp5Var46);
                        java.util.LinkedList list106 = dp5Var6.getList(5);
                        r45.dp5 dp5Var47 = new r45.dp5();
                        dp5Var47.set(0, "RepairerConfig_Media_VideoEncodeForceSoftOrHard_Int");
                        dp5Var47.set(1, "composition视频编辑强制使用软/硬编");
                        dp5Var47.set(2, 3);
                        java.util.LinkedList list107 = dp5Var47.getList(3);
                        kotlin.jvm.internal.o.f(list107, "getValues(...)");
                        kz5.h0.w(list107, new java.lang.String[]{"0", "1", "2"});
                        java.util.LinkedList list108 = dp5Var47.getList(6);
                        kotlin.jvm.internal.o.f(list108, "getValueAlias(...)");
                        kz5.h0.w(list108, new java.lang.String[]{"默认", "软编", "硬编"});
                        list106.add(dp5Var47);
                        java.util.LinkedList list109 = dp5Var6.getList(5);
                        r45.dp5 dp5Var48 = new r45.dp5();
                        dp5Var48.set(0, "RepairerConfig_Media_MediaAudioUseMaasClassifier_Int");
                        dp5Var48.set(1, "编辑器音乐面板推荐列表使用Maas");
                        dp5Var48.set(2, 3);
                        java.util.LinkedList list110 = dp5Var48.getList(3);
                        kotlin.jvm.internal.o.f(list110, "getValues(...)");
                        kz5.h0.w(list110, new java.lang.String[]{"0", "1", "2"});
                        java.util.LinkedList list111 = dp5Var48.getList(6);
                        kotlin.jvm.internal.o.f(list111, "getValueAlias(...)");
                        kz5.h0.w(list111, new java.lang.String[]{"X实验", "开启", "关闭"});
                        list109.add(dp5Var48);
                        java.util.LinkedList list112 = dp5Var6.getList(5);
                        r45.dp5 dp5Var49 = new r45.dp5();
                        dp5Var49.set(0, "RepairerConfig_Media_PhotoImproveEdit_Int");
                        dp5Var49.set(1, "图片编辑器升级入口");
                        dp5Var49.set(2, 3);
                        java.util.LinkedList list113 = dp5Var49.getList(3);
                        kotlin.jvm.internal.o.f(list113, "getValues(...)");
                        kz5.h0.w(list113, new java.lang.String[]{"0", "1", "2"});
                        java.util.LinkedList list114 = dp5Var49.getList(6);
                        kotlin.jvm.internal.o.f(list114, "getValueAlias(...)");
                        kz5.h0.w(list114, new java.lang.String[]{"X实验", "开启", "关闭"});
                        list112.add(dp5Var49);
                        java.util.LinkedList list115 = dp5Var6.getList(5);
                        r45.dp5 dp5Var50 = new r45.dp5();
                        dp5Var50.set(0, "RepairerConfig_Media_MediaAudioPanelV2UI_Int");
                        dp5Var50.set(1, "视频号编辑器音乐面板V2");
                        dp5Var50.set(2, 3);
                        java.util.LinkedList list116 = dp5Var50.getList(3);
                        kotlin.jvm.internal.o.f(list116, "getValues(...)");
                        kz5.h0.w(list116, new java.lang.String[]{"0", "1", "2"});
                        java.util.LinkedList list117 = dp5Var50.getList(6);
                        kotlin.jvm.internal.o.f(list117, "getValueAlias(...)");
                        kz5.h0.w(list117, new java.lang.String[]{"X实验", "开启", "关闭"});
                        list115.add(dp5Var50);
                        arrayList.add(dp5Var6);
                        arrayList.add(repairerGroupSns.h());
                        list2.addAll(arrayList);
                        dp5Var5 = dp5Var9;
                        obj2 = newInstance;
                    } else {
                        dp5Var2 = dp5Var4;
                        y0Var = y0Var2;
                        hashMap2 = hashMap3;
                        it = it6;
                        cls = cls2;
                        obj2 = newInstance;
                        gVar = gVar2;
                        if (obj2 instanceof com.tencent.mm.repairer.group.RepairerGroupPay) {
                            dp5Var5.getList(5).addAll(((com.tencent.mm.repairer.group.RepairerGroupPay) obj2).h());
                        }
                    }
                    hashMap = hashMap2;
                    cls2 = cls;
                    hashMap.put(cls2, new jz5.l(gVar.e(), dp5Var5));
                } else {
                    dp5Var2 = dp5Var4;
                    y0Var = y0Var2;
                    hashMap = hashMap3;
                    it = it6;
                    obj2 = newInstance;
                }
                if (obj2 instanceof q55.a) {
                    r45.dp5 dp5Var51 = new r45.dp5();
                    q55.a aVar3 = (q55.a) obj2;
                    dp5Var51.set(0, aVar3.b());
                    dp5Var51.set(1, aVar3.c());
                    dp5Var51.set(2, 4);
                    dp5Var51.set(10, cls2.getName());
                    dp5Var51.set(7, 0);
                    dp5Var51.set(11, Integer.MAX_VALUE);
                    hashMap.put(cls2, new jz5.l(aVar3.e(), dp5Var51));
                }
                if (obj2 instanceof q55.c) {
                    r45.dp5 dp5Var52 = new r45.dp5();
                    q55.c cVar = (q55.c) obj2;
                    dp5Var52.set(0, cVar.b());
                    dp5Var52.set(1, cVar.c());
                    dp5Var52.set(2, 2);
                    dp5Var52.getList(3).add(cVar.h());
                    dp5Var52.getList(3).add(java.lang.String.valueOf(cVar.i()));
                    dp5Var52.set(7, java.lang.Integer.valueOf(cVar.g()));
                    dp5Var52.set(11, Integer.MAX_VALUE);
                    hashMap.put(cls2, new jz5.l(cVar.e(), dp5Var52));
                }
                if (obj2 instanceof q55.e) {
                    r45.dp5 dp5Var53 = new r45.dp5();
                    q55.e eVar = (q55.e) obj2;
                    dp5Var53.set(0, eVar.l());
                    dp5Var53.set(1, eVar.c());
                    dp5Var53.set(2, 3);
                    dp5Var53.set(7, java.lang.Integer.valueOf(eVar.g()));
                    dp5Var53.set(11, java.lang.Integer.valueOf(eVar.d()));
                    dp5Var53.set(4, java.lang.Integer.valueOf(eVar.m()));
                    dp5Var53.set(12, eVar.f());
                    if (obj2 instanceof q55.d) {
                        q55.d dVar = (q55.d) obj2;
                        dp5Var53.getList(3).addAll(dVar.o());
                        dp5Var53.getList(6).addAll(dVar.n());
                    }
                    java.lang.String h17 = eVar.h();
                    switch (h17.hashCode()) {
                        case -1808118735:
                            if (h17.equals("String") && !(eVar.i() instanceof java.lang.String)) {
                                break;
                            }
                            break;
                        case 73679:
                            if (h17.equals("Int") && !(eVar.i() instanceof java.lang.Integer)) {
                                break;
                            }
                            break;
                        case 2374300:
                            if (h17.equals("Long") && !(eVar.i() instanceof java.lang.Long)) {
                                break;
                            }
                            break;
                        case 67973692:
                            if (h17.equals("Float") && !(eVar.i() instanceof java.lang.Float)) {
                                break;
                            }
                            break;
                    }
                    dp5Var53.set(8, eVar.i().toString());
                    hashMap.put(cls2, new jz5.l(eVar.e(), dp5Var53));
                    java.util.HashMap hashMap4 = ix3.y0.f295612e;
                    java.lang.String string = dp5Var53.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    hashMap4.put(string, obj2);
                }
                hashMap3 = hashMap;
                it6 = it;
                y0Var2 = y0Var;
                dp5Var4 = dp5Var2;
                i17 = 1;
            }
            r45.dp5 dp5Var54 = dp5Var4;
            ix3.y0 y0Var3 = y0Var2;
            java.util.HashMap hashMap5 = hashMap3;
            for (java.util.Map.Entry entry : hashMap5.entrySet()) {
                if (!kotlin.jvm.internal.o.b(entry.getKey(), com.tencent.mm.repairer.group.RepairerGroupMain.class) && (lVar = (jz5.l) hashMap5.get((java.lang.Class) ((jz5.l) entry.getValue()).f302833d)) != null && (dp5Var = (r45.dp5) lVar.f302834e) != null && (list = dp5Var.getList(5)) != null) {
                    list.add(((jz5.l) entry.getValue()).f302834e);
                }
            }
            dp5Var3 = dp5Var54;
            java.util.LinkedList list118 = dp5Var3.getList(5);
            kotlin.jvm.internal.o.f(list118, "getSubItemList(...)");
            y0Var2 = y0Var3;
            y0Var2.V6(list118);
        }
        java.lang.String T6 = y0Var2.T6(dp5Var3);
        if ((!r26.n0.N(T6)) && (O6 = y0Var2.O6()) != null) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(O6, kotlinx.coroutines.internal.b0.f310484a, null, new ix3.u0(y0Var2, T6, null), 2, null);
        }
        if (!gm0.j1.a()) {
            y0Var2.U6(dp5Var3);
        }
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = y0Var2.P6();
        if (P6 != null && (stateCenter = P6.getStateCenter()) != null) {
            stateCenter.B3(new hx3.a(dp5Var3));
        }
        return jz5.f0.f302826a;
    }
}
