package wp4;

@j95.b
/* loaded from: classes10.dex */
public final class b0 extends i95.w implements yc0.g {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f448403d = "MicroMsg.VideoJumperApiImpl";

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Ai(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof wp4.a0
            if (r0 == 0) goto L13
            r0 = r9
            wp4.a0 r0 = (wp4.a0) r0
            int r1 = r0.f448401h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f448401h = r1
            goto L18
        L13:
            wp4.a0 r0 = new wp4.a0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f448399f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f448401h
            dw3.e0 r3 = dw3.e0.f244202a
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 != r4) goto L31
            java.lang.Object r8 = r0.f448398e
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r8 = (com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider) r8
            java.lang.Object r0 = r0.f448397d
            wp4.b0 r0 = (wp4.b0) r0
            kotlin.ResultKt.throwOnFailure(r9)
            goto L7f
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r2 = "videoCompositionRemuxVideoApi >> configProvider: "
            r9.<init>(r2)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            java.lang.String r2 = r7.f448403d
            com.tencent.mars.xlog.Log.i(r2, r9)
            java.lang.String r9 = r8.A
            java.lang.String r5 = "inputVideoPath"
            kotlin.jvm.internal.o.f(r9, r5)
            dw3.d0 r9 = r3.a(r9)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "inputVideoInfo： "
            r5.<init>(r6)
            r5.append(r9)
            java.lang.String r9 = r5.toString()
            com.tencent.mars.xlog.Log.i(r2, r9)
            xp4.e r9 = new xp4.e
            r9.<init>()
            r0.f448397d = r7
            r0.f448398e = r8
            r0.f448401h = r4
            java.lang.Object r9 = r9.a(r8, r0)
            if (r9 != r1) goto L7e
            return r1
        L7e:
            r0 = r7
        L7f:
            yc0.e r9 = (yc0.e) r9
            java.lang.String r8 = r8.B
            java.lang.String r1 = "outputVideoPath"
            kotlin.jvm.internal.o.f(r8, r1)
            dw3.d0 r8 = r3.a(r8)
            java.lang.String r0 = r0.f448403d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "outputInfo: "
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            com.tencent.mars.xlog.Log.i(r0, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: wp4.b0.Ai(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Bi(java.lang.String r10, java.lang.String r11, java.lang.String r12, yc0.f r13, kotlin.coroutines.Continuation r14) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wp4.b0.Bi(java.lang.String, java.lang.String, java.lang.String, yc0.f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void wi(android.app.Activity activity, int i17, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        com.tencent.mars.xlog.Log.i(this.f448403d, "jumpVideoCompositionRemuxUI");
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.plugin.vlog.ui.video.VideoCompositionRemuxUI.class);
        intent.putExtra("KEY_PARAMS_CONFIG", configProvider);
        if (bundle != null) {
            intent.putExtra("key_extra_data", bundle);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/video/remux/api_Impl/VideoJumperApiImpl", "jumpVideoCompositionRemuxUI", "(Landroid/app/Activity;ILcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;Landroid/os/Bundle;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }
}
