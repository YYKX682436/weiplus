package com.tencent.mm.ui.chatting.adapter;

/* loaded from: classes12.dex */
public class z extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f198455d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f198456e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f198457f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f198458g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.CheckBox f198459h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f198460i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f198461m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.adapter.a0 f198462n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.tencent.mm.ui.chatting.adapter.a0 a0Var, android.view.View view) {
        super(view);
        this.f198462n = a0Var;
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.gtj);
        this.f198455d = imageView;
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.p0s);
        this.f198456e = findViewById;
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.mwq);
        this.f198458g = findViewById2;
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.p0p);
        this.f198457f = textView;
        android.widget.CheckBox checkBox = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.jdh);
        this.f198459h = checkBox;
        android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.jdi);
        this.f198460i = findViewById3;
        this.f198461m = view.findViewById(com.tencent.mm.R.id.f482919rs);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById3, arrayList.toArray(), "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter$ViewHolder", "<init>", "(Lcom/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter$ViewHolder", "<init>", "(Lcom/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        checkBox.setVisibility(8);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter$ViewHolder", "<init>", "(Lcom/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter$ViewHolder", "<init>", "(Lcom/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textView.setVisibility(8);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter$ViewHolder", "<init>", "(Lcom/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter$ViewHolder", "<init>", "(Lcom/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        imageView.setOnClickListener(new com.tencent.mm.ui.chatting.adapter.x(this, a0Var));
        findViewById3.setOnClickListener(new com.tencent.mm.ui.chatting.adapter.y(this, a0Var));
    }
}
