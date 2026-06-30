package com.tencent.mm.plugin.fts.ui.widget;

/* loaded from: classes12.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.widget.v f138326d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.tencent.mm.plugin.fts.ui.widget.v vVar) {
        super(0);
        this.f138326d = vVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.fts.ui.widget.v vVar = this.f138326d;
        com.tencent.mm.ui.widget.imageview.WeImageButton weImageButton = (com.tencent.mm.ui.widget.imageview.WeImageButton) vVar.findViewById(com.tencent.mm.R.id.vom);
        weImageButton.setOnClickListener(new com.tencent.mm.plugin.fts.ui.widget.t(vVar));
        return weImageButton;
    }
}
