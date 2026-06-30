package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class c2 implements com.tencent.mm.plugin.multitalk.ilinkservice.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.i4 f149531a;

    public c2(com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var) {
        this.f149531a = i4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.plugin.multitalk.ilinkservice.e0
    public java.lang.Object a(int i17, java.lang.Object obj) {
        int i18;
        zi3.f fVar;
        android.media.AudioTrack audioTrack;
        zi3.f fVar2;
        com.tencent.mm.plugin.voip.model.e eVar;
        this.f149531a.T();
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = this.f149531a;
        i4Var.getClass();
        i4Var.f149620d2 = ym1.f.wi().f();
        i4Var.f149622e2 = ym1.f.wi().f();
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "seenli, ilinkservice  mILinkSpeakerMode=%d, mILinkPhoneMode=%d", java.lang.Integer.valueOf(i4Var.f149620d2), java.lang.Integer.valueOf(i4Var.f149622e2));
        i4Var.f149624f2 = 0;
        i4Var.f149626g2 = 0;
        if (com.tencent.mm.plugin.multitalk.model.e3.Ri().f150160J != null) {
            i4Var.f149624f2 = com.tencent.mm.plugin.multitalk.model.e3.Ri().f150160J.E();
            i4Var.f149626g2 = com.tencent.mm.plugin.multitalk.model.e3.Ri().f150160J.E();
            com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "seenli, ilinkservice mILinkSpeakerStreamType=%d", java.lang.Integer.valueOf(i4Var.f149624f2));
        }
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var2 = this.f149531a;
        com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149702d = i4Var2.Y1;
        com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149703e = i4Var2.Z1;
        com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149704f = i4Var2.f149616a2;
        com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149705g = i4Var2.f149617b2;
        com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149706h = i4Var2.f149618c2;
        com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149707i = i4Var2.f149620d2;
        com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149708j = i4Var2.f149622e2;
        com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149710l = i4Var2.f149624f2;
        com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149711m = i4Var2.f149626g2;
        com.tencent.mm.plugin.multitalk.ilinkservice.s sVar = i4Var2.f149625g;
        com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149709k = sVar.f149760b == null ? 0 : sVar.f149760b.f420152e;
        this.f149531a.f149625g.f149759a.getClass();
        zi3.f fVar3 = com.tencent.mm.plugin.multitalk.model.e3.Ri().f150160J;
        com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149712n = fVar3 != null ? fVar3.f473171l : 0;
        com.tencent.mm.plugin.multitalk.ilinkservice.s sVar2 = this.f149531a.f149625g;
        com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149713o = sVar2.f149760b == null ? 0 : sVar2.f149760b.b();
        com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149714p = (this.f149531a.f149625g.f149759a == null || (fVar2 = com.tencent.mm.plugin.multitalk.model.e3.Ri().f150160J) == null || (eVar = fVar2.f473170k) == null) ? 0 : eVar.L;
        if (this.f149531a.f149625g.f149759a != null && (fVar = com.tencent.mm.plugin.multitalk.model.e3.Ri().f150160J) != null) {
            com.tencent.mm.plugin.voip.model.e eVar2 = fVar.f473170k;
            if (eVar2 != null) {
                android.media.AudioManager audioManager = (android.media.AudioManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
                if (audioManager != null && (audioTrack = eVar2.f176452o) != null) {
                    i18 = audioManager.getStreamVolume(audioTrack.getStreamType());
                }
            } else {
                i18 = -1;
            }
            com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149715q = i18;
            this.f149531a.f149625g.getClass();
            this.f149531a.f149625g.getClass();
            this.f149531a.f149625g.getClass();
            com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149716r = 0L;
            com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149717s = 0L;
            com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149718t = 0;
            r45.t70 t70Var = new r45.t70();
            t70Var.f386175d = com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149699a;
            t70Var.f386177f = com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149700b;
            t70Var.f386178g = com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149701c;
            t70Var.f386186r = com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149713o;
            t70Var.f386191w = com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149714p;
            t70Var.f386185q = com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149712n;
            t70Var.D = com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149702d;
            t70Var.E = com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149703e;
            t70Var.F = com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149704f;
            t70Var.G = com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149705g;
            t70Var.H = com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149706h;
            t70Var.f386181m = com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149709k;
            t70Var.f386179h = com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149707i;
            t70Var.f386180i = com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149708j;
            t70Var.f386182n = com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149710l;
            t70Var.f386183o = com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149711m;
            t70Var.f386187s = com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149715q;
            t70Var.f386188t = com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149716r;
            t70Var.f386189u = com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149717s;
            int i19 = com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149718t;
            t70Var.f386190v = i19;
            com.tencent.mars.xlog.Log.i("MicroMsg.ILinkReporter", "amyfwang,interrupt_cnt:%d", java.lang.Integer.valueOf(i19));
            this.f149531a.J(new com.tencent.mm.plugin.multitalk.ilinkservice.b2(this, i17));
            return t70Var;
        }
        i18 = 0;
        com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149715q = i18;
        this.f149531a.f149625g.getClass();
        this.f149531a.f149625g.getClass();
        this.f149531a.f149625g.getClass();
        com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149716r = 0L;
        com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149717s = 0L;
        com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149718t = 0;
        r45.t70 t70Var2 = new r45.t70();
        t70Var2.f386175d = com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149699a;
        t70Var2.f386177f = com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149700b;
        t70Var2.f386178g = com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149701c;
        t70Var2.f386186r = com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149713o;
        t70Var2.f386191w = com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149714p;
        t70Var2.f386185q = com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149712n;
        t70Var2.D = com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149702d;
        t70Var2.E = com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149703e;
        t70Var2.F = com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149704f;
        t70Var2.G = com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149705g;
        t70Var2.H = com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149706h;
        t70Var2.f386181m = com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149709k;
        t70Var2.f386179h = com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149707i;
        t70Var2.f386180i = com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149708j;
        t70Var2.f386182n = com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149710l;
        t70Var2.f386183o = com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149711m;
        t70Var2.f386187s = com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149715q;
        t70Var2.f386188t = com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149716r;
        t70Var2.f386189u = com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149717s;
        int i192 = com.tencent.mm.plugin.multitalk.ilinkservice.m0.f149718t;
        t70Var2.f386190v = i192;
        com.tencent.mars.xlog.Log.i("MicroMsg.ILinkReporter", "amyfwang,interrupt_cnt:%d", java.lang.Integer.valueOf(i192));
        this.f149531a.J(new com.tencent.mm.plugin.multitalk.ilinkservice.b2(this, i17));
        return t70Var2;
    }

    @Override // com.tencent.mm.plugin.multitalk.ilinkservice.e0
    public /* bridge */ /* synthetic */ java.lang.Object b(byte[] bArr) {
        return null;
    }

    @Override // com.tencent.mm.plugin.multitalk.ilinkservice.e0
    public byte[] c(java.lang.Object obj) {
        r45.t70 t70Var = (r45.t70) obj;
        if (t70Var != null) {
            try {
                return t70Var.toByteArray();
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Multitalk.ILinkService", e17, "hy: error when convert to byte array", new java.lang.Object[0]);
            }
        }
        return new byte[0];
    }

    @Override // com.tencent.mm.plugin.multitalk.ilinkservice.e0
    public boolean d() {
        return true;
    }
}
