package u22;

/* loaded from: classes10.dex */
public final class t implements u22.c {

    /* renamed from: a, reason: collision with root package name */
    public final u22.s f424028a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.recyclerview.widget.f2 f424029b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f424030c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f424031d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f424032e;

    /* renamed from: f, reason: collision with root package name */
    public int f424033f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f424034g;

    public t(u22.s callback, androidx.recyclerview.widget.f2 adapter) {
        kotlin.jvm.internal.o.g(callback, "callback");
        kotlin.jvm.internal.o.g(adapter, "adapter");
        this.f424028a = callback;
        this.f424029b = adapter;
        this.f424030c = "MicroMsg.StickerRecommendData";
        this.f424031d = new java.util.LinkedList();
        this.f424033f = 1;
        this.f424034g = true;
    }

    @Override // u22.c
    public void a(int i17, int i18) {
        this.f424029b.notifyItemRangeChanged(i17, i18);
    }

    @Override // u22.c
    public void b(java.util.List lensList) {
        int i17;
        kotlin.jvm.internal.o.g(lensList, "lensList");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateData: ");
        sb6.append(lensList.size());
        sb6.append(", ");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(new com.tencent.mm.sdk.platformtools.z3());
        com.tencent.mars.xlog.Log.i(this.f424030c, sb6.toString());
        java.util.LinkedList lensList2 = this.f424031d;
        lensList2.clear();
        lensList2.addAll(lensList);
        u22.s sVar = this.f424028a;
        a32.a0 a0Var = (a32.a0) sVar;
        a0Var.getClass();
        kotlin.jvm.internal.o.g(lensList2, "lensList");
        com.tencent.mm.plugin.emojicapture.ui.capture.EditorStickerView editorStickerView = a0Var.f1003a;
        com.tencent.mars.xlog.Log.i(editorStickerView.f98666d, "update: " + lensList2.size());
        boolean isEmpty = lensList2.isEmpty() ^ true;
        int i18 = -1;
        int i19 = 0;
        com.tencent.mm.plugin.emojicapture.ui.capture.StickerSelectFrame stickerSelectFrame = editorStickerView.f98667e;
        androidx.recyclerview.widget.RecyclerView recyclerView = editorStickerView.f98668f;
        if (isEmpty) {
            recyclerView.setVisibility(0);
            stickerSelectFrame.setVisibility(0);
        } else {
            recyclerView.setVisibility(8);
            stickerSelectFrame.setVisibility(8);
            editorStickerView.f98670h = -1;
            yz5.p selectionCallback = editorStickerView.getSelectionCallback();
            if (selectionCallback != null) {
                selectionCallback.invoke(null, null);
            }
        }
        z22.l lVar = editorStickerView.f98669g;
        lVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.StickerAdapter", "update: " + lensList2.size());
        java.util.ArrayList arrayList = lVar.f469726d;
        arrayList.clear();
        arrayList.addAll(lensList2);
        if (this.f424034g && (!lensList.isEmpty())) {
            if (this.f424032e == null) {
                i17 = this.f424033f;
                this.f424034g = false;
            } else {
                java.util.Iterator it = lensList.iterator();
                int i27 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (kotlin.jvm.internal.o.b(((t85.d) it.next()).f416456a.f382792d, this.f424032e)) {
                        i18 = i27;
                        break;
                    }
                    i27++;
                }
                if (i18 > 0) {
                    this.f424034g = false;
                    i19 = i18;
                }
                i17 = i19;
            }
            com.tencent.mm.plugin.emojicapture.ui.capture.EditorStickerView editorStickerView2 = ((a32.a0) sVar).f1003a;
            com.tencent.mars.xlog.Log.i(editorStickerView2.f98666d, "updateSelection, " + i17);
            editorStickerView2.f98668f.post(new a32.z(editorStickerView2, i17));
        }
    }

    @Override // u22.c
    public void c(int i17, int i18) {
        this.f424029b.notifyItemRangeInserted(i17, i18);
    }

    @Override // u22.c
    public void d(int i17, int i18) {
        this.f424029b.notifyItemRangeRemoved(i17, i18);
    }

    @Override // u22.c
    public void onMove(int i17, int i18) {
        this.f424029b.notifyItemMoved(i17, i18);
    }
}
