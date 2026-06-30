package com.tencent.mm.plugin.finder.ui.fav;

/* loaded from: classes2.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.ui.fav.s f129203d = new com.tencent.mm.plugin.finder.ui.fav.s();

    public s() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.content.Context context = it.getContext();
        androidx.appcompat.app.AppCompatActivity appCompatActivity = context instanceof androidx.appcompat.app.AppCompatActivity ? (androidx.appcompat.app.AppCompatActivity) context : null;
        return java.lang.Boolean.valueOf(appCompatActivity == null || appCompatActivity.mo133getLifecycle().b() == androidx.lifecycle.n.RESUMED);
    }
}
