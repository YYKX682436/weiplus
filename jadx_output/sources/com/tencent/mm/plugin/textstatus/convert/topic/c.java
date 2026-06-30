package com.tencent.mm.plugin.textstatus.convert.topic;

/* loaded from: classes8.dex */
public final class c extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final yz5.a f173258e;

    public c(yz5.a aVar) {
        this.f173258e = aVar;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.czx;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String str;
        nj4.b item = (nj4.b) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.h5z);
        imageView.setImageResource(com.tencent.mm.R.raw.default_avatar);
        hj4.b i19 = ai4.m0.f5173a.i();
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.om8);
        int a17 = i19.a();
        java.lang.String str2 = "";
        android.content.Context context = holder.f293121e;
        textView.setText(a17 != 1 ? a17 != 2 ? "" : context.getString(com.tencent.mm.R.string.jw_) : context.getString(com.tencent.mm.R.string.jwa, java.lang.Integer.valueOf(i19.f281661b)));
        if (i19.f281661b > 0) {
            str2 = i19.f281662c;
        } else {
            hj4.a aVar = i19.f281660a;
            if (aVar != null && (str = aVar.f281659a) != null) {
                str2 = str;
            }
        }
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(imageView, str2, 0.1f);
        android.view.View view = holder.itemView;
        android.widget.FrameLayout frameLayout = view instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) view : null;
        if (frameLayout != null) {
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            java.util.ArrayList arrayList = ((com.tencent.mm.plugin.textstatus.ui.ac) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.textstatus.ui.ac.class)).f173727e;
            if (arrayList.size() > 1) {
                arrayList.get(0);
            }
            frameLayout.setPadding(frameLayout.getPaddingLeft(), frameLayout.getPaddingTop(), frameLayout.getPaddingRight(), i65.a.h(context, com.tencent.mm.R.dimen.f479688cn));
        }
        holder.p(com.tencent.mm.R.id.f485489hv2).setOnClickListener(new com.tencent.mm.plugin.textstatus.convert.topic.b(holder, this));
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.View p17 = holder.p(com.tencent.mm.R.id.f485489hv2);
        float b17 = i65.a.b(recyclerView.getContext(), 4);
        boolean z17 = (4 & 12) != 0;
        boolean z18 = (12 & 8) != 0;
        if (p17 != null) {
            p17.setOutlineProvider(new bk4.e2(z17, z18, b17));
        }
        if (p17 == null) {
            return;
        }
        p17.setClipToOutline(true);
    }
}
