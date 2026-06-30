package com.tencent.mm.plugin.finder.member.convert;

/* loaded from: classes2.dex */
public final class n extends mo2.q {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.plugin.finder.member.question.c cVar, androidx.appcompat.app.AppCompatActivity appCompatActivity, java.lang.String authorFinderUsername, boolean z17, int i17) {
        super(cVar, appCompatActivity, authorFinderUsername, z17, i17);
        kotlin.jvm.internal.o.g(authorFinderUsername, "authorFinderUsername");
    }

    @Override // mo2.q
    public void s(com.tencent.mm.plugin.finder.model.BaseFinderFeed item, in5.s0 holder) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(holder, "holder");
        ((android.widget.FrameLayout) holder.p(com.tencent.mm.R.id.f485881r82)).setVisibility(8);
        if (this.f330391h) {
            return;
        }
        holder.p(com.tencent.mm.R.id.pzw).setOnLongClickListener(new com.tencent.mm.plugin.finder.member.convert.m(this, holder, item));
    }
}
