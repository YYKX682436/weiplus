package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class wa extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC f136328d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa(com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC finderEmojiListUIC) {
        super(0);
        this.f136328d = finderEmojiListUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f136328d.getActivity().getIntent().getStringExtra("key_biz_passthrough_info");
        if (stringExtra == null) {
            stringExtra = "{}";
        }
        return d75.b.e(new org.json.JSONObject(stringExtra), com.tencent.mm.plugin.finder.viewmodel.component.va.f136231d);
    }
}
