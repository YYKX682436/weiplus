package com.tencent.mm.plugin.luckymoney.story;

/* loaded from: classes4.dex */
public class k0 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f145887d;

    public k0(java.lang.String str) {
        this.f145887d = str;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopeStoryVideoManager", "task callback: %s", java.lang.Integer.valueOf(i17));
        if (i17 == 0) {
            return 0;
        }
        com.tencent.mm.vfs.w6.h(this.f145887d);
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
