package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class h extends com.tencent.mm.plugin.finder.profile.uic.f6 {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f134562e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f134563f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f134564g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f134562e = "FinderAccountLogOutUIC";
        this.f134563f = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.g(this));
        this.f134564g = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.e(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i(this.f134562e, "FinderAccountLogOutUIC [onCreate]");
        ((android.widget.TextView) this.f134564g.getValue()).setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.f(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f134562e = "FinderAccountLogOutUIC";
        this.f134563f = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.g(this));
        this.f134564g = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.e(this));
    }
}
