package com.tencent.mm.plugin.finder.member.preview;

/* loaded from: classes2.dex */
public final class b extends eo2.i {

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f121172r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f121172r = "";
    }

    @Override // eo2.i
    public v92.g W6() {
        return new fo2.e(getActivity(), this.f121172r);
    }

    @Override // eo2.i
    public java.lang.String X6() {
        r45.tr0 tr0Var = (r45.tr0) this.f255580d;
        java.lang.String str = tr0Var != null ? tr0Var.f386724e : null;
        return str == null ? "" : str;
    }

    @Override // eo2.i, eo2.j, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("key_author_finder_name");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f121172r = stringExtra;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f121172r = "";
    }
}
