package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class fd extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public boolean f134393d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f134394e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f134394e = new java.util.HashMap();
    }

    public final boolean O6(long j17) {
        java.lang.Object obj = this.f134394e.get(java.lang.Long.valueOf(j17));
        if (obj == null) {
            obj = java.lang.Boolean.FALSE;
        }
        return ((java.lang.Boolean) obj).booleanValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f134394e = new java.util.HashMap();
    }
}
