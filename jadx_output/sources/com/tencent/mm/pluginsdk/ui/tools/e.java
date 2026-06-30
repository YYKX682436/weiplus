package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes8.dex */
public class e implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f191594d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f191595e;

    public e(com.tencent.mm.ui.MMActivity mMActivity, int i17) {
        this.f191594d = mMActivity;
        this.f191595e = i17;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.pluginsdk.ui.tools.f.f(this.f191594d, i17, i18, intent, true, com.tencent.mm.R.string.brq, com.tencent.mm.R.string.brr, this.f191595e);
    }
}
