package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes4.dex */
public class FileSelectorFolderView extends android.widget.LinearLayout implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.FrameLayout f191361d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f191362e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ListView f191363f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f191364g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f191365h;

    public FileSelectorFolderView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f191364g = false;
        this.f191365h = false;
        a();
    }

    public final void a() {
        setOrientation(1);
        this.f191361d = new android.widget.FrameLayout(getContext());
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -1);
        this.f191361d.setVisibility(8);
        addView(this.f191361d, layoutParams);
        android.view.View view = new android.view.View(getContext());
        this.f191362e = view;
        view.setBackgroundColor(-872415232);
        this.f191362e.setOnClickListener(new com.tencent.mm.pluginsdk.ui.tools.h1(this));
        this.f191361d.addView(this.f191362e, new android.widget.FrameLayout.LayoutParams(-1, -1));
        android.widget.ListView listView = new android.widget.ListView(getContext());
        this.f191363f = listView;
        listView.setCacheColorHint(0);
        this.f191363f.setBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478494f));
        this.f191363f.setSelector(com.tencent.mm.R.drawable.f481981ap3);
        this.f191363f.setOnItemClickListener(this);
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.i_);
        this.f191363f.setPadding(dimensionPixelSize, dimensionPixelSize / 3, dimensionPixelSize, 0);
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479623ay);
        layoutParams2.gravity = 80;
        this.f191361d.addView(this.f191363f, layoutParams2);
        this.f191363f.setAdapter((android.widget.ListAdapter) new com.tencent.mm.pluginsdk.ui.tools.j1(getContext()));
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/tools/FileSelectorFolderView", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        this.f191362e.performClick();
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorFolderView", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    public void setListener(com.tencent.mm.pluginsdk.ui.tools.i1 i1Var) {
    }

    public FileSelectorFolderView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f191364g = false;
        this.f191365h = false;
        a();
    }
}
