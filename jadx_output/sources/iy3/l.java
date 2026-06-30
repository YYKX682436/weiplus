package iy3;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Liy3/l;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCInteger;", "<init>", "()V", "feature-exdevice_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes13.dex */
public final class l implements com.tencent.mm.ipcinvoker.j {
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    @Override // com.tencent.mm.ipcinvoker.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void invoke(java.lang.Object r6, com.tencent.mm.ipcinvoker.r r7) {
        /*
            r5 = this;
            android.os.Bundle r6 = (android.os.Bundle) r6
            if (r6 == 0) goto Lb
            java.lang.String r0 = "username"
            java.lang.String r6 = r6.getString(r0)
            goto Lc
        Lb:
            r6 = 0
        Lc:
            my3.u r0 = my3.c0.f332784k
            my3.c0 r0 = r0.a()
            r0.getClass()
            boolean r1 = r0.f332789d
            java.lang.String r2 = "MicroMsg.Rtos.RtosWatchService"
            if (r1 != 0) goto L21
            java.lang.String r6 = "tryAutoLogin but not init"
            com.tencent.mars.xlog.Log.w(r2, r6)
            goto L74
        L21:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "begin try auto login username="
            r1.<init>(r3)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            com.tencent.mars.xlog.Log.i(r2, r1)
            r1 = 0
            r3 = 1
            if (r6 == 0) goto L44
            int r4 = r6.length()
            if (r4 != 0) goto L3e
            r4 = r3
            goto L3f
        L3e:
            r4 = r1
        L3f:
            if (r4 == 0) goto L42
            goto L44
        L42:
            r4 = r1
            goto L45
        L44:
            r4 = r3
        L45:
            r0.f332795j = r4
            com.tencent.wechat.rtos.WeChatApi r4 = r0.f332787b
            if (r4 == 0) goto L4f
            int r1 = r4.tryAutoLogin(r6)
        L4f:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r4 = "try auto login "
            r6.<init>(r4)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            com.tencent.mars.xlog.Log.i(r2, r6)
            if (r7 == 0) goto L6a
            com.tencent.mm.ipcinvoker.type.IPCInteger r6 = new com.tencent.mm.ipcinvoker.type.IPCInteger
            r6.<init>(r1)
            r7.a(r6)
        L6a:
            if (r1 == 0) goto L74
            if (r1 == r3) goto L74
            r6 = -3
            if (r1 == r6) goto L74
            r0.a()
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: iy3.l.invoke(java.lang.Object, com.tencent.mm.ipcinvoker.r):void");
    }
}
