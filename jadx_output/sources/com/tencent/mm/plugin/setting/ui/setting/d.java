package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.r f160926d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f160927e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.ui.base.preference.r rVar, java.lang.String str) {
        super(0);
        this.f160926d = rVar;
        this.f160927e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.base.preference.Preference preference;
        com.tencent.mm.ui.base.preference.r rVar = this.f160926d;
        if (rVar != null) {
            preference = ((com.tencent.mm.ui.base.preference.h0) rVar).h(this.f160927e);
        } else {
            preference = null;
        }
        if (preference instanceof com.tencent.mm.ui.base.preference.IconPreference) {
            return (com.tencent.mm.ui.base.preference.IconPreference) preference;
        }
        return null;
    }
}
