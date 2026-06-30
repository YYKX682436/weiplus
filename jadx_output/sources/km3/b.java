package km3;

/* loaded from: classes10.dex */
public final class b extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f309238d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(km3.d dVar, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f309238d = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.j7m);
        itemView.setOnClickListener(new km3.a(dVar, this));
    }
}
