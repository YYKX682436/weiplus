package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public final class kt implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.lt f118856a;

    public kt(com.tencent.mm.plugin.finder.live.widget.lt ltVar) {
        this.f118856a = ltVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton checkbox, boolean z17) {
        kotlin.jvm.internal.o.g(checkbox, "checkbox");
        if (z17) {
            java.lang.Object tag = checkbox.getTag();
            kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.model.FinderLiveQcPollResponseOption");
            dk2.ic icVar = (dk2.ic) tag;
            com.tencent.mm.plugin.finder.live.widget.lt ltVar = this.f118856a;
            if (kotlin.jvm.internal.o.b(ltVar.f118976f, icVar.f233622a)) {
                return;
            }
            ltVar.f118976f = icVar.f233622a;
            ltVar.notifyItemRangeChanged(0, ltVar.getItemCount());
            ltVar.f118599e.invoke(icVar);
        }
    }
}
