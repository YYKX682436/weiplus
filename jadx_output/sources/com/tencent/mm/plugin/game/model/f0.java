package com.tencent.mm.plugin.game.model;

/* loaded from: classes8.dex */
public class f0 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: e, reason: collision with root package name */
    public static boolean f140305e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.LinkedList f140306f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public static com.tencent.mm.sdk.platformtools.n3 f140307g;

    /* renamed from: d, reason: collision with root package name */
    public int f140308d = 0;

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            f140307g.post(new com.tencent.mm.plugin.game.model.e0(this, m1Var));
            return;
        }
        f140305e = false;
        f140307g.quit();
        gm0.j1.d().q(1215, this);
    }
}
