package gm3;

/* loaded from: classes10.dex */
public final class h extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final gm3.f f273556e;

    public h(gm3.f listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f273556e = listener;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.c4t;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        gm3.c item = (gm3.c) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = (com.tencent.mm.ui.widget.MMRoundCornerImageView) holder.itemView.findViewById(com.tencent.mm.R.id.f487295o70);
        mMRoundCornerImageView.setRadius(i65.a.b(holder.f293121e, 8));
        gm3.a aVar = item.f273547h;
        if (com.tencent.mm.sdk.platformtools.t8.K0(aVar != null ? aVar.f273537c : null)) {
            gm3.b bVar = item.f273548i;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(bVar != null ? bVar.f273541a : null)) {
                gm3.b bVar2 = item.f273548i;
                java.lang.String str = bVar2 != null ? bVar2.f273541a : null;
                kotlin.jvm.internal.o.d(str);
                ll3.i1 i1Var = ll3.i1.f319182a;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("thumb_");
                byte[] bytes = str.getBytes(r26.c.f368865a);
                kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                sb6.append(kk.k.g(bytes));
                java.lang.String o17 = new com.tencent.mm.vfs.r6(i1Var.b(sb6.toString())).o();
                kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
                o11.f fVar = new o11.f();
                fVar.f342078b = true;
                fVar.f342077a = true;
                fVar.f342082f = o17;
                java.lang.Object[] objArr = new java.lang.Object[1];
                gm3.b bVar3 = item.f273548i;
                objArr[0] = bVar3 != null ? bVar3.f273541a : null;
                fVar.f342102z = objArr;
                n11.a b17 = n11.a.b();
                gm3.b bVar4 = item.f273548i;
                b17.h(bVar4 != null ? bVar4.f273541a : null, mMRoundCornerImageView, fVar.a());
            }
        } else {
            gm3.a aVar2 = item.f273547h;
            if (aVar2 != null) {
                long j17 = aVar2.f273535a;
                if (-1 == j17) {
                    o11.f fVar2 = new o11.f();
                    fVar2.f342077a = true;
                    fVar2.f342085i = 1;
                    n11.a.b().h(aVar2.f273537c, mMRoundCornerImageView, fVar2.a());
                } else {
                    long j18 = aVar2.f273536b;
                    e60.b1 b1Var = (e60.b1) i95.n0.c(e60.b1.class);
                    java.lang.String str2 = aVar2.f273537c;
                    if (str2 == null) {
                        str2 = "";
                    }
                    ((o23.i) b1Var).Ai(mMRoundCornerImageView, 2, str2, "", j17, j18);
                }
            }
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.itemView.findViewById(com.tencent.mm.R.id.crz);
        weImageView.setVisibility(8);
        if (item.f273544e != 0) {
            weImageView.setVisibility(0);
        }
        weImageView.setOnClickListener(new gm3.g(this, i17, item));
        android.widget.TextView textView = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.oyt);
        if (item.f273549m > 0) {
            textView.setVisibility(0);
            int i19 = item.f273549m;
            if (i19 < 0) {
                textView.setText("--:--");
            } else {
                int a17 = lm3.d0.a(i19);
                java.lang.String valueOf = java.lang.String.valueOf(a17 % 60);
                if (valueOf.length() < 2) {
                    valueOf = "0".concat(valueOf);
                }
                textView.setText((a17 / 60) + ':' + valueOf);
            }
        } else {
            textView.setVisibility(8);
        }
        int i27 = item.f273550n;
        if (i27 != -1) {
            holder.itemView.setBackgroundResource(i27);
        } else {
            holder.itemView.setBackground(null);
        }
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
