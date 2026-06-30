package qw2;

/* loaded from: classes10.dex */
public abstract class c extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qw2.f f367116d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(qw2.f fVar, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f367116d = fVar;
        itemView.setOnClickListener(new qw2.b(this, fVar));
    }

    public void i(int i17, r45.p64 info) {
        kotlin.jvm.internal.o.g(info, "info");
        this.itemView.setSelected(i17 == this.f367116d.f367122e);
    }
}
