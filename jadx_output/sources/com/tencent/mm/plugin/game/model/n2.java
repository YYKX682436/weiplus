package com.tencent.mm.plugin.game.model;

/* loaded from: classes8.dex */
public class n2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f140383d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f140384e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f140385f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f140386g;

    public n2(com.tencent.mm.plugin.game.model.r2 r2Var, android.content.Context context, java.lang.String str, float f17, int i17) {
        this.f140383d = context;
        this.f140384e = str;
        this.f140385f = f17;
        this.f140386g = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        o53.e eVar = ((com.tencent.mm.plugin.game.ui.LiteAppGameTabUI) this.f140383d).f140986e;
        eVar.getClass();
        java.lang.String str = this.f140384e;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            try {
                eVar.setActionBarColorValue(android.graphics.Color.parseColor(str) | (-16777216));
            } catch (java.lang.Exception unused) {
            }
        }
        eVar.setIconDark(this.f140386g);
        float f17 = this.f140385f;
        if (f17 < 0.0f || f17 > 1.0f) {
            return;
        }
        eVar.setAlpha(f17);
    }
}
