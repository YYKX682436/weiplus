package ze5;

/* loaded from: classes9.dex */
public final class b4 extends com.tencent.mm.ui.chatting.viewitems.g0 {

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingNoteMvvmView f471837b;

    public final ze5.b4 a(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        super.create(view);
        this.f471837b = (com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingNoteMvvmView) view.findViewById(com.tencent.mm.R.id.sr_);
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.ott);
        this.uploadingPB = findViewById instanceof android.widget.ProgressBar ? (android.widget.ProgressBar) findViewById : null;
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.bqx);
        this.stateIV = findViewById2 instanceof android.widget.ImageView ? (android.widget.ImageView) findViewById2 : null;
        android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.brc);
        this.userTV = findViewById3 instanceof android.widget.TextView ? (android.widget.TextView) findViewById3 : null;
        android.view.View findViewById4 = view.findViewById(com.tencent.mm.R.id.bkf);
        this.checkBox = findViewById4 instanceof android.widget.CheckBox ? (android.widget.CheckBox) findViewById4 : null;
        this.maskView = view.findViewById(com.tencent.mm.R.id.bpa);
        return this;
    }
}
