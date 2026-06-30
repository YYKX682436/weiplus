package jz0;

/* loaded from: classes4.dex */
public final class f0 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public boolean f302574d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f302575e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f302576f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f302575e = true;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        this.f302574d = getIntent().getBooleanExtra("intent_video_is_preview", false);
        android.view.View findViewById = getActivity().findViewById(com.tencent.mm.R.id.dqc);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        if (this.f302574d) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.tencent.mm.ui.MMActivity) activity).addIconOptionMenu(0, com.tencent.mm.R.string.f490367t0, com.tencent.mm.R.raw.icons_outlined_delete, new jz0.c0(this));
            androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
            kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.tencent.mm.ui.MMActivity) activity2).setBackBtn(new jz0.d0(this));
        } else {
            androidx.appcompat.app.AppCompatActivity activity3 = getActivity();
            kotlin.jvm.internal.o.e(activity3, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.tencent.mm.ui.MMActivity) activity3).hideTitleView();
        }
        findViewById.setOnClickListener(new jz0.e0(this));
    }
}
