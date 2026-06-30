package sj3;

/* loaded from: classes8.dex */
public final class q5 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f408717d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f408718e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View.OnClickListener f408719f;

    /* renamed from: g, reason: collision with root package name */
    public final int f408720g;

    public q5(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f408717d = context;
        this.f408718e = new java.util.ArrayList();
        this.f408720g = 1;
    }

    public final void B(java.util.ArrayList userNameList, android.view.View.OnClickListener onClickListener) {
        kotlin.jvm.internal.o.g(userNameList, "userNameList");
        kotlin.jvm.internal.o.g(onClickListener, "onClickListener");
        java.util.ArrayList arrayList = this.f408718e;
        arrayList.clear();
        arrayList.add(c01.z1.r());
        int size = userNameList.size();
        for (int i17 = 0; i17 < size; i17++) {
            java.lang.Object obj = userNameList.get(i17);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            if (!x((java.lang.String) obj) && !kotlin.jvm.internal.o.b(userNameList.get(i17), c01.z1.r())) {
                arrayList.add(userNameList.get(i17));
            }
        }
        this.f408719f = onClickListener;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f408718e.size() + this.f408720g;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return i17 == 0 ? 2 : 1;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        int z17;
        sj3.r5 holder = (sj3.r5) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        boolean z18 = i17 == 0 ? 2 : true;
        java.util.ArrayList arrayList = this.f408718e;
        android.widget.ImageView imageView = holder.f408730d;
        if (!z18) {
            if ((i17 == 0 ? (char) 2 : (char) 1) != 2 || arrayList.size() < 5) {
                return;
            }
            int i18 = sj3.i1.f408568m;
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(i18 / 2, i18);
            layoutParams.topMargin = sj3.i1.f408562g;
            layoutParams.setMarginStart(0);
            holder.itemView.setLayoutParams(layoutParams);
            imageView.setVisibility(8);
            android.view.View view = holder.f408731e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/SmallAvatarAdapterInContactUI", "onBindViewHolder", "(Lcom/tencent/mm/plugin/multitalk/ui/widget/SmallAvatarHolderInContactUI;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/SmallAvatarAdapterInContactUI", "onBindViewHolder", "(Lcom/tencent/mm/plugin/multitalk/ui/widget/SmallAvatarHolderInContactUI;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        int i19 = i17 - 1;
        java.lang.Object obj = arrayList.get(i19);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        java.lang.String str = (java.lang.String) obj;
        android.view.View view2 = holder.f408731e;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/SmallAvatarAdapterInContactUI", "onBindViewHolder", "(Lcom/tencent/mm/plugin/multitalk/ui/widget/SmallAvatarHolderInContactUI;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/multitalk/ui/widget/SmallAvatarAdapterInContactUI", "onBindViewHolder", "(Lcom/tencent/mm/plugin/multitalk/ui/widget/SmallAvatarHolderInContactUI;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int i27 = sj3.i1.f408568m;
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(i27, i27);
        layoutParams2.addRule(1);
        layoutParams2.topMargin = sj3.i1.f408562g;
        if (i19 != 0) {
            z17 = sj3.i1.f408561f;
        } else {
            z17 = z() >= 0 ? z() : 0;
        }
        layoutParams2.setMarginStart(z17);
        holder.itemView.setLayoutParams(layoutParams2);
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, str, null);
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        holder.itemView.setTag(com.tencent.mm.R.id.nwv, c01.a2.e(str));
        imageView.setOnClickListener(this.f408719f);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f408717d).inflate(com.tencent.mm.R.layout.f489474co1, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new sj3.r5(inflate);
    }

    public final boolean x(java.lang.String str) {
        java.lang.Object obj;
        java.util.Iterator it = this.f408718e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.o.b((java.lang.String) obj, str)) {
                break;
            }
        }
        return obj != null;
    }

    public final java.lang.StringBuffer y() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.h27));
        java.util.Iterator it = this.f408718e.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(((tg3.v0) i95.n0.c(tg3.v0.class)) != null ? c01.a2.e(str) : null);
            sb6.append(',');
            stringBuffer.append(sb6.toString());
        }
        return stringBuffer;
    }

    public final int z() {
        int i17 = com.tencent.mm.ui.bk.h(this.f408717d).x;
        int i18 = sj3.i1.f408568m;
        return ((i17 - ((this.f408718e.size() * i18) + (sj3.i1.f408561f * (r2.size() - 1)))) / 2) - i18;
    }
}
