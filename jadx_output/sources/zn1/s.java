package zn1;

/* loaded from: classes11.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f474470d;

    /* renamed from: e, reason: collision with root package name */
    public int f474471e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f474472f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.mmaoa.UsbAttachIntentUI f474473g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(android.content.Intent intent, com.tencent.mm.plugin.backup.mmaoa.UsbAttachIntentUI usbAttachIntentUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f474472f = intent;
        this.f474473g = usbAttachIntentUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zn1.s(this.f474472f, this.f474473g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((zn1.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r11.f474471e
            android.content.Intent r2 = r11.f474472f
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            com.tencent.mm.plugin.backup.mmaoa.UsbAttachIntentUI r7 = r11.f474473g
            r8 = 0
            if (r1 == 0) goto L30
            if (r1 == r6) goto L28
            if (r1 == r5) goto L24
            if (r1 == r4) goto L24
            if (r1 != r3) goto L1c
            kotlin.ResultKt.throwOnFailure(r12)
            goto Lc2
        L1c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L24:
            kotlin.ResultKt.throwOnFailure(r12)
            goto L98
        L28:
            java.lang.Object r1 = r11.f474470d
            com.tencent.mm.plugin.backup.mmaoa.UsbAttachIntentUI r1 = (com.tencent.mm.plugin.backup.mmaoa.UsbAttachIntentUI) r1
            kotlin.ResultKt.throwOnFailure(r12)
            goto L5e
        L30:
            kotlin.ResultKt.throwOnFailure(r12)
            java.lang.String r12 = "accessory"
            android.os.Parcelable r12 = r2.getParcelableExtra(r12)
            android.hardware.usb.UsbAccessory r12 = (android.hardware.usb.UsbAccessory) r12
            if (r12 == 0) goto L98
            java.lang.String r1 = r7.f92550d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Find an usbAccessory="
            r9.<init>(r10)
            r9.append(r12)
            java.lang.String r9 = r9.toString()
            com.tencent.mars.xlog.Log.i(r1, r9)
            zn1.p r1 = zn1.p.f474464a
            r11.f474470d = r7
            r11.f474471e = r6
            java.lang.Object r12 = r1.b(r12, r11)
            if (r12 != r0) goto L5d
            return r0
        L5d:
            r1 = r7
        L5e:
            zn1.f r12 = (zn1.f) r12
            zn1.e r6 = zn1.e.f474432a
            boolean r6 = kotlin.jvm.internal.o.b(r12, r6)
            if (r6 == 0) goto L7c
            kotlinx.coroutines.p0 r12 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r12 = kotlinx.coroutines.internal.b0.f310484a
            zn1.q r4 = new zn1.q
            r4.<init>(r1, r8)
            r11.f474470d = r8
            r11.f474471e = r5
            java.lang.Object r12 = kotlinx.coroutines.l.g(r12, r4, r11)
            if (r12 != r0) goto L98
            return r0
        L7c:
            zn1.d r5 = zn1.d.f474425a
            boolean r12 = kotlin.jvm.internal.o.b(r12, r5)
            if (r12 == 0) goto L98
            kotlinx.coroutines.p0 r12 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r12 = kotlinx.coroutines.internal.b0.f310484a
            zn1.r r5 = new zn1.r
            r5.<init>(r1, r8)
            r11.f474470d = r8
            r11.f474471e = r4
            java.lang.Object r12 = kotlinx.coroutines.l.g(r12, r5, r11)
            if (r12 != r0) goto L98
            return r0
        L98:
            java.lang.String r12 = "device"
            android.os.Parcelable r12 = r2.getParcelableExtra(r12)
            android.hardware.usb.UsbDevice r12 = (android.hardware.usb.UsbDevice) r12
            if (r12 == 0) goto Lc4
            java.lang.String r1 = r7.f92550d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Find an usbDevice="
            r2.<init>(r4)
            r2.append(r12)
            java.lang.String r2 = r2.toString()
            com.tencent.mars.xlog.Log.i(r1, r2)
            zn1.i0 r1 = zn1.i0.f474447a
            r11.f474470d = r8
            r11.f474471e = r3
            java.lang.Object r12 = r1.d(r12, r11)
            if (r12 != r0) goto Lc2
            return r0
        Lc2:
            zn1.m r12 = (zn1.m) r12
        Lc4:
            java.lang.String r12 = r7.f92550d
            java.lang.String r0 = "Device not found"
            com.tencent.mars.xlog.Log.e(r12, r0)
            jz5.f0 r12 = jz5.f0.f302826a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: zn1.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
