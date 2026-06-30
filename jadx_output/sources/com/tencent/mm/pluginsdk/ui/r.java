package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes.dex */
public class r implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f191092d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f191093e;

    public r(android.widget.ImageView imageView, java.lang.String str) {
        this.f191092d = imageView;
        this.f191093e = str;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/AvatarDrawable$Factory$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        android.widget.ImageView imageView = this.f191092d;
        com.tencent.mm.sdk.platformtools.b0.d(imageView.getContext(), "UserName:", this.f191093e, null);
        dp.a.makeText(imageView.getContext(), com.tencent.mm.R.string.f490361st, 0).show();
        yj0.a.i(true, this, "com/tencent/mm/pluginsdk/ui/AvatarDrawable$Factory$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
