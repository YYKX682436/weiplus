package qr2;

/* loaded from: classes2.dex */
public final class g {
    public g(kotlin.jvm.internal.i iVar) {
    }

    public static void a(qr2.g gVar, java.util.ArrayList feeds, com.tencent.mm.view.recyclerview.WxRecyclerAdapter adapter, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if ((i17 & 8) != 0) {
            z18 = true;
        }
        gVar.getClass();
        kotlin.jvm.internal.o.g(feeds, "feeds");
        kotlin.jvm.internal.o.g(adapter, "adapter");
        if (z17 && !(!((java.util.ArrayList) kz5.j0.I(feeds, qr2.i.class)).isEmpty())) {
            feeds.add(0, new qr2.i());
            if (z18) {
                adapter.notifyItemInserted(0);
            }
        }
    }
}
