package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class qt extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.ut f135737d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qt(com.tencent.mm.plugin.finder.viewmodel.component.ut utVar) {
        super(0);
        this.f135737d = utVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f135737d.getActivity().getIntent().getStringExtra("KEY_RINGTONE_REPORT_JSON");
        return stringExtra == null ? "" : stringExtra;
    }
}
