package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public final class ft implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.gt f118373a;

    public ft(com.tencent.mm.plugin.finder.live.widget.gt gtVar) {
        this.f118373a = gtVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton checkbox, boolean z17) {
        kotlin.jvm.internal.o.g(checkbox, "checkbox");
        java.lang.Object tag = checkbox.getTag();
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.model.FinderLiveQcPollResponseOption");
        dk2.ic icVar = (dk2.ic) tag;
        com.tencent.mm.plugin.finder.live.widget.gt gtVar = this.f118373a;
        java.lang.String str = icVar.f233622a;
        if (!z17) {
            ((java.util.HashSet) gtVar.f118477f).remove(str);
        } else {
            ((java.util.HashSet) gtVar.f118477f).add(str);
            gtVar.f118599e.invoke(icVar);
        }
    }
}
