package com.tencent.mm.plugin.finder.member.convert;

/* loaded from: classes2.dex */
public final class r extends mo2.q {

    /* renamed from: u, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.member.convert.o f121157u = new com.tencent.mm.plugin.finder.member.convert.o(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.mm.plugin.finder.member.question.c cVar, androidx.appcompat.app.AppCompatActivity appCompatActivity, java.lang.String authorFinderUsername, boolean z17, int i17) {
        super(cVar, appCompatActivity, authorFinderUsername, z17, i17);
        kotlin.jvm.internal.o.g(authorFinderUsername, "authorFinderUsername");
    }

    @Override // mo2.q
    public void s(com.tencent.mm.plugin.finder.model.BaseFinderFeed item, in5.s0 holder) {
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderMedia first;
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(holder, "holder");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) holder.p(com.tencent.mm.R.id.r87);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.r88);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.r89);
        frameLayout.setVisibility(0);
        frameLayout.setOutlineProvider(this.f330400t);
        r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(item.getFeedObject().getMediaList());
        boolean z17 = this.f330391h;
        if (mb4Var != null) {
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(mb4Var.getString(16));
            mn2.g1 g1Var = mn2.g1.f329975a;
            if (K0) {
                mn2.c1 c1Var = new mn2.c1(mb4Var, com.tencent.mm.plugin.finder.storage.y90.f128356f, null, null, 12, null);
                vo0.d e17 = g1Var.e();
                kotlin.jvm.internal.o.d(imageView);
                e17.c(c1Var, imageView, g1Var.h(mn2.f1.B));
            } else {
                mn2.r3 r3Var = new mn2.r3(mb4Var, com.tencent.mm.plugin.finder.storage.y90.f128355e, null, 4, null);
                vo0.d e18 = g1Var.e();
                kotlin.jvm.internal.o.d(imageView);
                e18.c(r3Var, imageView, g1Var.h(mn2.f1.E));
            }
            com.tencent.mm.plugin.finder.member.convert.o oVar = f121157u;
            android.content.Context context = holder.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            android.graphics.Rect a17 = oVar.a(context, mb4Var.getFloat(5) > mb4Var.getFloat(4), z17, ((java.lang.Number) ((jz5.n) this.f330394n).getValue()).intValue());
            android.view.ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.width = a17.width();
            marginLayoutParams.height = a17.height();
        }
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = item.getFeedObject().getFeedObject().getObjectDesc();
        int videoDuration = (objectDesc == null || (media = objectDesc.getMedia()) == null || (first = media.getFirst()) == null) ? 0 : first.getVideoDuration();
        if (videoDuration > 0) {
            textView.setVisibility(0);
            textView.setText(com.tencent.mm.plugin.finder.assist.w2.c(videoDuration));
        } else {
            textView.setVisibility(8);
        }
        frameLayout.setOnClickListener(new com.tencent.mm.plugin.finder.member.convert.p(item, this, holder));
        com.tencent.mm.plugin.finder.member.convert.q qVar = new com.tencent.mm.plugin.finder.member.convert.q(this, holder, item);
        if (!z17) {
            holder.p(com.tencent.mm.R.id.pzw).setOnLongClickListener(qVar);
        }
        frameLayout.setOnLongClickListener(qVar);
    }
}
