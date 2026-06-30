package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes8.dex */
public final class rn implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.mw1 f135810d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Long f135811e;

    /* renamed from: f, reason: collision with root package name */
    public r45.ma7 f135812f;

    /* renamed from: g, reason: collision with root package name */
    public r45.kj5 f135813g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f135814h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Long f135815i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderJumpInfo f135816m;

    /* renamed from: n, reason: collision with root package name */
    public int f135817n;

    public rn(r45.mw1 item) {
        kotlin.jvm.internal.o.g(item, "item");
        this.f135810d = item;
    }

    public final java.lang.String a() {
        r45.k74 lite_app_info;
        r45.k74 lite_app_info2;
        r45.k74 lite_app_info3;
        r45.k74 lite_app_info4;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("appid:");
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = this.f135816m;
        java.lang.String str = null;
        sb6.append((finderJumpInfo == null || (lite_app_info4 = finderJumpInfo.getLite_app_info()) == null) ? null : lite_app_info4.getString(0));
        sb6.append(", query:");
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2 = this.f135816m;
        sb6.append((finderJumpInfo2 == null || (lite_app_info3 = finderJumpInfo2.getLite_app_info()) == null) ? null : lite_app_info3.getString(2));
        sb6.append(", path:");
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo3 = this.f135816m;
        sb6.append((finderJumpInfo3 == null || (lite_app_info2 = finderJumpInfo3.getLite_app_info()) == null) ? null : lite_app_info2.getString(1));
        sb6.append(", default_url:");
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo4 = this.f135816m;
        if (finderJumpInfo4 != null && (lite_app_info = finderJumpInfo4.getLite_app_info()) != null) {
            str = lite_app_info.getString(3);
        }
        sb6.append(str);
        sb6.append(", ");
        return sb6.toString();
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        com.tencent.mm.plugin.finder.viewmodel.component.rn rnVar = obj instanceof com.tencent.mm.plugin.finder.viewmodel.component.rn ? (com.tencent.mm.plugin.finder.viewmodel.component.rn) obj : null;
        return (rnVar == null || !com.tencent.mm.sdk.platformtools.t8.B0(rnVar.getItemId(), getItemId())) ? -1 : 0;
    }

    @Override // in5.c
    public long getItemId() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        r45.mw1 mw1Var = this.f135810d;
        sb6.append(mw1Var.getInteger(2));
        sb6.append('_');
        sb6.append(mw1Var.getString(5));
        sb6.append('_');
        sb6.append(mw1Var.getInteger(1));
        return sb6.toString().hashCode();
    }

    @Override // in5.c
    public int h() {
        return com.tencent.mm.plugin.finder.viewmodel.component.rn.class.hashCode();
    }
}
