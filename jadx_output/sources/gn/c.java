package gn;

/* loaded from: classes14.dex */
public class c extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.chatroom.ui.le f273562d;

    public c(android.view.View view, com.tencent.mm.chatroom.ui.ie ieVar) {
        super(view);
        com.tencent.mm.chatroom.ui.le leVar = (com.tencent.mm.chatroom.ui.le) view;
        this.f273562d = leVar;
        leVar.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -1));
        leVar.setClickable(true);
        leVar.setOnDayClickListener(ieVar);
    }
}
