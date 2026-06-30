package wu;

/* loaded from: classes9.dex */
public final class w0 extends wu.p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(hu.f uiParams, com.tencent.mm.plugin.mvvmlist.MvvmList<hu.b> mvvmList) {
        super(uiParams, mvvmList);
        kotlin.jvm.internal.o.g(uiParams, "uiParams");
        kotlin.jvm.internal.o.g(mvvmList, "mvvmList");
    }

    @Override // wu.p
    public void n(android.widget.FrameLayout containerView, hu.b item, int i17, int i18) {
        android.widget.TextView textView;
        wu.e2 e2Var;
        kotlin.jvm.internal.o.g(containerView, "containerView");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.ImageView imageView = (android.widget.ImageView) containerView.findViewById(com.tencent.mm.R.id.h5n);
        if (imageView == null || (textView = (android.widget.TextView) containerView.findViewById(com.tencent.mm.R.id.obc)) == null) {
            return;
        }
        s15.h hVar = item.f284997e;
        int integer = hVar.getInteger(hVar.f303422d + 2);
        if (integer != 34) {
            switch (integer) {
                case 39:
                    break;
                case 40:
                    e2Var = new wu.e2();
                    e2Var.f449565a = wu.t0.f449627d;
                    e2Var.f449566b = wu.u0.f449632d;
                    break;
                case 41:
                    e2Var = new wu.e2();
                    e2Var.f449565a = wu.r0.f449618d;
                    e2Var.f449566b = new wu.s0(this);
                    break;
                case 42:
                    e2Var = new wu.e2();
                    e2Var.f449565a = wu.p0.f449612d;
                    e2Var.f449566b = new wu.q0(this);
                    break;
                default:
                    e2Var = new wu.e2();
                    break;
            }
            e2Var.f449565a.invoke(item, imageView, textView);
            containerView.setOnClickListener(new wu.v0(e2Var, item));
        }
        e2Var = new wu.e2();
        e2Var.f449565a = wu.m0.f449597d;
        e2Var.f449566b = new wu.o0(this);
        e2Var.f449565a.invoke(item, imageView, textView);
        containerView.setOnClickListener(new wu.v0(e2Var, item));
    }

    @Override // wu.p
    public void p(android.widget.FrameLayout containerView, int i17) {
        kotlin.jvm.internal.o.g(containerView, "containerView");
        com.tencent.mm.ui.id.b(containerView.getContext()).inflate(com.tencent.mm.R.layout.f489378em0, (android.view.ViewGroup) containerView, true);
    }
}
