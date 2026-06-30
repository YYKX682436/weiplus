package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class b4 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public yz5.l f116920d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f116921e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f116922f;

    /* renamed from: g, reason: collision with root package name */
    public az2.f f116923g;

    /* renamed from: h, reason: collision with root package name */
    public int f116924h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f116925i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f116924h = 3;
        this.f116925i = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.finder.live.viewmodel.a4(this), true);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        android.widget.Button button = this.f116921e;
        if (button != null) {
            return button.performClick();
        }
        return false;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        this.f116921e = (android.widget.Button) getActivity().findViewById(com.tencent.mm.R.id.etp);
        this.f116922f = (android.widget.TextView) getActivity().findViewById(com.tencent.mm.R.id.f484607ew3);
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) getActivity().findViewById(com.tencent.mm.R.id.f7v);
        kotlin.jvm.internal.o.d(progressBar);
        az2.f fVar = new az2.f();
        fVar.f16128c = 1000L;
        az2.r rVar = new az2.r();
        rVar.f16151b = progressBar;
        fVar.f16127b = rVar;
        this.f116923g = fVar;
        android.widget.Button button = this.f116921e;
        if (button != null) {
            button.setOnClickListener(new com.tencent.mm.plugin.finder.live.viewmodel.z3(this));
        }
        az2.f fVar2 = this.f116923g;
        if (fVar2 != null) {
            fVar2.b();
        }
        android.widget.TextView textView = this.f116922f;
        if (textView != null) {
            textView.setVisibility(0);
        }
        android.widget.TextView textView2 = this.f116922f;
        if (textView2 != null) {
            textView2.setText(java.lang.String.valueOf(this.f116924h));
        }
        this.f116925i.c(1000L, 1000L);
        az2.f fVar3 = this.f116923g;
        if (fVar3 != null) {
            fVar3.b();
        }
    }
}
