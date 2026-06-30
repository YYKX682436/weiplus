package wo1;

/* loaded from: classes5.dex */
public abstract class v extends androidx.recyclerview.widget.f2 {
    public static final int $stable = 8;
    private android.view.View emptyView;
    private long estimatedSize;
    private yz5.l onMoreIconClicked;
    private boolean showMore;
    private boolean showSize;
    private wo1.m sortAdapter;
    private final java.lang.String TAG = "BaseContactAdapter";
    private final java.util.HashMap<java.lang.String, java.lang.Integer> convMap = new java.util.HashMap<>();
    private final java.util.List<wo1.n> convList = new java.util.ArrayList();
    private final java.util.ArrayList<java.lang.String> selectedUsers = new java.util.ArrayList<>();
    private wo1.l selectedListAdapter = new wo1.u(this);

    public final boolean contains(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        return this.convMap.containsKey(username);
    }

    public abstract wo1.m createSortTypeAdapter(android.content.Context context);

    public final long getEstimatedSize() {
        if (this.showSize) {
            return this.estimatedSize;
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.convList.size() + 1;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return i17 == this.convList.size() ? 1 : 0;
    }

    public final yz5.l getOnMoreIconClicked() {
        return this.onMoreIconClicked;
    }

    public final java.util.List<java.lang.String> getSelectedList() {
        return this.selectedUsers;
    }

    public final wo1.l getSelectedListAdapter() {
        return this.selectedListAdapter;
    }

    public final boolean getShowMore() {
        return this.showMore;
    }

    public final boolean getShowSize() {
        return this.showSize;
    }

    public final android.widget.BaseAdapter getSortTypeAdapter() {
        wo1.m mVar = this.sortAdapter;
        if (mVar != null) {
            return mVar;
        }
        kotlin.jvm.internal.o.o("sortAdapter");
        throw null;
    }

    public final java.lang.String getSortTypeDescription() {
        wo1.m mVar = this.sortAdapter;
        if (mVar != null) {
            return mVar.a()[mVar.f447988d];
        }
        kotlin.jvm.internal.o.o("sortAdapter");
        throw null;
    }

    public abstract java.lang.CharSequence getSpannedName(android.content.Context context, java.lang.String str);

    public final void initAdapter(android.content.Context ctx, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(intent, "intent");
        this.convList.clear();
        initAdapter(intent, this.convList);
        this.sortAdapter = createSortTypeAdapter(ctx);
        onSortTypeChanged(0);
    }

    public abstract void initAdapter(android.content.Intent intent, java.util.List list);

    public final boolean isSelectAll() {
        return this.convList.size() == this.selectedUsers.size();
    }

    public final boolean isSelected(java.lang.String str) {
        java.lang.Integer num = this.convMap.get(str);
        if (num != null) {
            int intValue = num.intValue();
            wo1.n nVar = (intValue < 0 || intValue > this.convList.size()) ? null : this.convList.get(intValue);
            if (nVar != null) {
                return nVar.f447995d;
            }
        }
        return false;
    }

    public final void notifyUserdataChanged(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        java.lang.Integer num = this.convMap.get(username);
        if (num != null) {
            notifyItemChanged(num.intValue());
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        if (i17 == this.convList.size()) {
            return;
        }
        wo1.n nVar = this.convList.get(i17);
        wo1.b1 b1Var = (wo1.b1) holder;
        b1Var.f447905d.setChecked(nVar.f447995d);
        com.tencent.mm.feature.avatar.w wVar = (com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class));
        android.widget.ImageView imageView = b1Var.f447906e;
        java.lang.String str = nVar.f447992a;
        wVar.Ai(imageView, str, null);
        android.widget.TextView textView = b1Var.f447907f;
        android.content.Context context = textView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        textView.setText(getSpannedName(context, str));
        if (this.showSize) {
            b1Var.f447908g.setText(com.tencent.mm.sdk.platformtools.t8.S1(nVar.f447994c));
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        if (i17 != 0) {
            android.content.res.Resources resources = parent.getResources();
            float dimension = (2 * resources.getDimension(com.tencent.mm.R.dimen.aky)) + resources.getDimension(com.tencent.mm.R.dimen.akw);
            android.view.View view = new android.view.View(parent.getContext());
            view.setLayoutParams(new androidx.recyclerview.widget.RecyclerView.LayoutParams(-1, (int) dimension));
            this.emptyView = view;
            android.view.View view2 = this.emptyView;
            kotlin.jvm.internal.o.d(view2);
            wo1.o oVar = new wo1.o(view2);
            android.view.View view3 = this.emptyView;
            kotlin.jvm.internal.o.d(view3);
            view3.setTag(oVar);
            return oVar;
        }
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.en9, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        wo1.b1 b1Var = new wo1.b1(inflate);
        inflate.setTag(b1Var);
        b1Var.itemView.setOnClickListener(new wo1.p(b1Var, this));
        b1Var.f447905d.setVisibility(0);
        b1Var.f447908g.setVisibility(this.showSize ? 0 : 8);
        boolean z17 = this.showMore;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = b1Var.f447909h;
        if (z17) {
            weImageView.setImageResource(com.tencent.mm.R.raw.dot_3_circle_regular);
            weImageView.setVisibility(0);
        } else {
            weImageView.setVisibility(8);
        }
        weImageView.setOnClickListener(new wo1.q(b1Var, this));
        return b1Var;
    }

    public final void onSortTypeChanged(int i17) {
        wo1.m mVar = this.sortAdapter;
        if (mVar == null) {
            kotlin.jvm.internal.o.o("sortAdapter");
            throw null;
        }
        mVar.c(i17, this.convList);
        this.convMap.clear();
        int i18 = 0;
        for (java.lang.Object obj : this.convList) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            this.convMap.put(((wo1.n) obj).f447992a, java.lang.Integer.valueOf(i18));
            i18 = i19;
        }
        notifyDataSetChanged();
    }

    public final void selectAll() {
        java.util.Set<java.lang.String> keySet = this.convMap.keySet();
        kotlin.jvm.internal.o.f(keySet, "<get-keys>(...)");
        x(keySet);
    }

    public final void setInitialSelection(java.util.List<java.lang.String> initSelection) {
        kotlin.jvm.internal.o.g(initSelection, "initSelection");
        x(initSelection);
    }

    public final void setOnMoreIconClicked(yz5.l lVar) {
        this.onMoreIconClicked = lVar;
    }

    public final void setShowMore(boolean z17) {
        this.showMore = z17;
    }

    public final void setShowSize(boolean z17) {
        this.showSize = z17;
    }

    public final void toggleSelected(java.lang.String str) {
        if (str == null) {
            com.tencent.mars.xlog.Log.w(this.TAG, "username is null");
            return;
        }
        java.lang.Integer num = this.convMap.get(str);
        wo1.n nVar = (num == null || num.intValue() < 0 || num.intValue() >= this.convList.size()) ? null : this.convList.get(num.intValue());
        if (num != null && nVar != null) {
            y(num.intValue());
            return;
        }
        com.tencent.mars.xlog.Log.w(this.TAG, "Fail to find the item by username=" + str + ", index=" + num);
    }

    public final void unselectAll() {
        this.estimatedSize = 0L;
        java.util.Iterator<T> it = this.convList.iterator();
        while (it.hasNext()) {
            ((wo1.n) it.next()).f447995d = false;
        }
        notifyDataSetChanged();
        this.selectedUsers.clear();
        this.selectedListAdapter.notifyDataSetChanged();
        yz5.q qVar = this.selectedListAdapter.f447981e;
        if (qVar != null) {
            qVar.invoke(this.selectedUsers, "", java.lang.Boolean.FALSE);
        }
    }

    public final void x(java.util.Collection collection) {
        java.util.Set X0 = kz5.n0.X0(collection);
        this.estimatedSize = 0L;
        for (wo1.n nVar : this.convList) {
            if (X0.contains(nVar.f447992a)) {
                nVar.f447995d = true;
                this.estimatedSize += nVar.f447994c;
            }
        }
        notifyDataSetChanged();
        this.selectedUsers.clear();
        this.selectedUsers.addAll(collection);
        this.selectedListAdapter.notifyDataSetChanged();
        yz5.q qVar = this.selectedListAdapter.f447981e;
        if (qVar != null) {
            qVar.invoke(this.selectedUsers, "", java.lang.Boolean.TRUE);
        }
    }

    public final void y(int i17) {
        wo1.n nVar = this.convList.get(i17);
        boolean z17 = !nVar.f447995d;
        nVar.f447995d = z17;
        long j17 = this.estimatedSize;
        long j18 = nVar.f447994c;
        if (!z17) {
            j18 = -j18;
        }
        this.estimatedSize = j17 + j18;
        notifyItemChanged(i17);
        boolean z18 = nVar.f447995d;
        java.lang.String str = nVar.f447992a;
        if (z18) {
            this.selectedUsers.add(str);
            this.selectedListAdapter.notifyItemInserted(this.selectedUsers.size() + 1);
            yz5.q qVar = this.selectedListAdapter.f447981e;
            if (qVar != null) {
                qVar.invoke(this.selectedUsers, str, java.lang.Boolean.TRUE);
                return;
            }
            return;
        }
        int indexOf = this.selectedUsers.indexOf(str);
        if (indexOf >= 0) {
            this.selectedUsers.remove(indexOf);
            this.selectedListAdapter.notifyItemRemoved(indexOf + 1);
            yz5.q qVar2 = this.selectedListAdapter.f447981e;
            if (qVar2 != null) {
                qVar2.invoke(this.selectedUsers, str, java.lang.Boolean.FALSE);
            }
        }
    }
}
