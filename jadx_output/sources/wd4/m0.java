package wd4;

/* loaded from: classes4.dex */
public final class m0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wd4.l1 f444970d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f444971e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f444972f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f444973g;

    public m0(wd4.l1 l1Var, com.tencent.mm.ui.MMActivity mMActivity, java.lang.String str, long j17) {
        this.f444970d = l1Var;
        this.f444971e = mMActivity;
        this.f444972f = str;
        this.f444973g = j17;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateMMMenu", "com.tencent.mm.plugin.sns.ui.sheet.ImageExcerptKt$addReadOriginTextChoose$1");
        g4Var.clear();
        g4Var.b(1016, com.tencent.mm.R.string.f492310g06, com.tencent.mm.R.raw.icons_outlined_subscriptions);
        this.f444970d.j(new wd4.l0(this.f444971e, this.f444972f, this.f444973g));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateMMMenu", "com.tencent.mm.plugin.sns.ui.sheet.ImageExcerptKt$addReadOriginTextChoose$1");
    }
}
