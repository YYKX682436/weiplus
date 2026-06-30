package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class kk implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.lk f118843a;

    public kk(com.tencent.mm.plugin.finder.live.widget.lk lkVar) {
        this.f118843a = lkVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton buttonView, boolean z17) {
        kotlin.jvm.internal.o.g(buttonView, "buttonView");
        com.tencent.mm.plugin.finder.live.widget.lk lkVar = this.f118843a;
        lkVar.f118944d = lkVar.b().isChecked() ? 1 : 0;
        lkVar.f118943c.onChange();
    }
}
