package z22;

/* loaded from: classes10.dex */
public final class k extends z22.h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(z22.l lVar, android.view.View itemView) {
        super(lVar, itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
    }

    @Override // z22.h
    public void i(int i17, r45.p64 info) {
        kotlin.jvm.internal.o.g(info, "info");
        vo0.d dVar = u85.p.f425721a;
        wo0.c a17 = u85.p.f425721a.a(new u85.a(info));
        android.widget.ImageView imageView = this.f469724d;
        kotlin.jvm.internal.o.f(imageView, "<get-icon>(...)");
        a17.c(imageView);
        this.f469725e.setText(info.f382794f);
    }
}
