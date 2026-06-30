package nx0;

/* loaded from: classes5.dex */
public final class u extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f341232d;

    /* renamed from: e, reason: collision with root package name */
    public final yo0.i f341233e;

    /* renamed from: f, reason: collision with root package name */
    public int f341234f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.p f341235g;

    public u(java.util.List beautyItemList) {
        kotlin.jvm.internal.o.g(beautyItemList, "beautyItemList");
        this.f341232d = beautyItemList;
        yo0.f fVar = new yo0.f();
        fVar.f464078b = true;
        fVar.f464077a = true;
        this.f341233e = fVar.a();
        this.f341234f = -1;
        this.f341235g = nx0.t.f341226d;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f341232d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        nx0.x xVar = (nx0.x) this.f341232d.get(i17);
        if (xVar instanceof nx0.w) {
            return 0;
        }
        if (xVar instanceof nx0.v) {
            return 1;
        }
        throw new jz5.j();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        java.lang.String string;
        int i18;
        kotlin.jvm.internal.o.g(holder, "holder");
        nx0.x xVar = (nx0.x) this.f341232d.get(i17);
        if (xVar instanceof nx0.w) {
            nx0.w wVar = (nx0.w) xVar;
            string = wVar.a() ? holder.itemView.getResources().getString(com.tencent.mm.R.string.mcm) : wVar.f341250c;
        } else {
            if (!(xVar instanceof nx0.v)) {
                throw new jz5.j();
            }
            string = holder.itemView.getResources().getString(((nx0.v) xVar).f341240b);
        }
        kotlin.jvm.internal.o.d(string);
        android.view.View view = holder.itemView;
        if (xVar.f341258a) {
            string = view.getResources().getString(com.tencent.mm.R.string.mck, string);
        }
        view.setContentDescription(string);
        if (!(holder instanceof nx0.p)) {
            if (holder instanceof nx0.o) {
                nx0.o oVar = (nx0.o) holder;
                oVar.f341182e.setBackground(i17 == this.f341234f ? k.a.a(holder.itemView.getContext(), com.tencent.mm.R.drawable.ckg) : null);
                nx0.v vVar = (nx0.v) xVar;
                com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = oVar.f341183f;
                mMRoundCornerImageView.setBackgroundResource(com.tencent.mm.R.drawable.ckf);
                mMRoundCornerImageView.setImageResource(vVar.f341241c);
                mMRoundCornerImageView.setOnClickListener(new nx0.s(this, i17, xVar));
                oVar.f341184g.setText(oVar.f341181d.getString(vVar.f341240b));
                android.view.View view2 = oVar.f341185h;
                i18 = (vVar.f341243e > vVar.f341242d ? 1 : (vVar.f341243e == vVar.f341242d ? 0 : -1)) == 0 ? 4 : 0;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i18));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/beautify/BeautyAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/shoot_composing/beautify/BeautyAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        nx0.p pVar = (nx0.p) holder;
        pVar.f341192d.setBackground(i17 == this.f341234f ? k.a.a(holder.itemView.getContext(), com.tencent.mm.R.drawable.ckg) : null);
        nx0.w wVar2 = (nx0.w) xVar;
        pVar.f341194f.setText(wVar2.f341250c);
        boolean a17 = wVar2.a();
        android.widget.ProgressBar progressBar = pVar.f341196h;
        com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView2 = pVar.f341193e;
        if (a17) {
            mMRoundCornerImageView2.setImageResource(com.tencent.mm.R.drawable.cl8);
            progressBar.setVisibility(8);
        } else {
            vo0.e eVar = vo0.e.f438467a;
            vo0.e.f438468b.c(wVar2.f341251d, mMRoundCornerImageView2, this.f341233e);
            progressBar.setVisibility(wVar2.f341252e ? 0 : 8);
        }
        mMRoundCornerImageView2.setOnClickListener(new nx0.r(this, i17, xVar));
        android.view.View view3 = pVar.f341195g;
        i18 = wVar2.f341258a ? 0 : 4;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/beautify/BeautyAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/mj_publisher/finder/shoot_composing/beautify/BeautyAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        if (i17 == 1) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.dwj, parent, false);
            kotlin.jvm.internal.o.d(inflate);
            return new nx0.o(this, inflate);
        }
        android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.dwi, parent, false);
        kotlin.jvm.internal.o.d(inflate2);
        return new nx0.p(this, inflate2);
    }

    public final void x(boolean z17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List list = this.f341232d;
        for (java.lang.Object obj : list) {
            if (((nx0.x) obj) instanceof nx0.w) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : list) {
            if (((nx0.x) obj2) instanceof nx0.v) {
                arrayList2.add(obj2);
            }
        }
        int size2 = arrayList2.size();
        kz5.h0.B(list, nx0.q.f341200d);
        if (z17) {
            notifyItemRangeRemoved(size, size2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0037 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[LOOP:0: B:8:0x0012->B:22:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean y() {
        /*
            r5 = this;
            java.util.List r0 = r5.f341232d
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 0
            if (r1 == 0) goto Le
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Le
            goto L38
        Le:
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L38
            java.lang.Object r1 = r0.next()
            nx0.x r1 = (nx0.x) r1
            boolean r3 = r1 instanceof nx0.v
            r4 = 1
            if (r3 == 0) goto L34
            nx0.v r1 = (nx0.v) r1
            float r3 = r1.f341243e
            float r1 = r1.f341242d
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L2f
            r1 = r4
            goto L30
        L2f:
            r1 = r2
        L30:
            if (r1 != 0) goto L34
            r1 = r4
            goto L35
        L34:
            r1 = r2
        L35:
            if (r1 == 0) goto L12
            r2 = r4
        L38:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: nx0.u.y():boolean");
    }

    public final void z() {
        int i17 = 0;
        for (java.lang.Object obj : this.f341232d) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            nx0.x xVar = (nx0.x) obj;
            if ((xVar instanceof nx0.v) && xVar.f341258a) {
                xVar.f341258a = false;
                notifyItemChanged(i17);
            }
            i17 = i18;
        }
    }
}
