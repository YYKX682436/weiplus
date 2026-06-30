package rl5;

/* loaded from: classes4.dex */
public class g implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.n4 f397315d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rl5.r f397316e;

    public g(rl5.r rVar, db5.n4 n4Var) {
        this.f397316e = rVar;
        this.f397315d = n4Var;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        rl5.r rVar = this.f397316e;
        rVar.f397356z.clear();
        com.tencent.mm.ui.yk.e("MicroMsg.MMPopupMenu", "registerForPopupMenu AbsListView long click", new java.lang.Object[0]);
        android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = new android.widget.AdapterView.AdapterContextMenuInfo(view, i17, j17);
        this.f397315d.a(rVar.f397356z, view, adapterContextMenuInfo);
        java.util.Iterator it = ((java.util.ArrayList) rVar.f397356z.f228344d).iterator();
        while (it.hasNext()) {
            ((db5.h4) ((android.view.MenuItem) it.next())).f228381y = adapterContextMenuInfo;
        }
        rVar.m();
        return true;
    }
}
