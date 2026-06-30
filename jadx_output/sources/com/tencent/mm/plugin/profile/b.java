package com.tencent.mm.plugin.profile;

/* loaded from: classes11.dex */
public final class b implements com.tencent.wechat.iam.biz.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f153387a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.o f153388b;

    public b(int i17, com.tencent.mm.plugin.profile.o oVar) {
        this.f153387a = i17;
        this.f153388b = oVar;
    }

    @Override // com.tencent.wechat.iam.biz.d1
    public final void complete(int i17) {
        com.tencent.mm.plugin.profile.o oVar = this.f153388b;
        if (this.f153387a != oVar.f153560t) {
            return;
        }
        oVar.f153557q = i17;
        if (oVar.f153558r) {
            android.view.View view = oVar.f153550j;
            if (view != null) {
                view.post(new com.tencent.mm.plugin.profile.a(oVar));
            } else {
                kotlin.jvm.internal.o.o("contentView");
                throw null;
            }
        }
    }
}
