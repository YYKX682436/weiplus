package com.tencent.mm.ui.conversation.banner;

/* loaded from: classes12.dex */
public class f extends com.tencent.mm.ui.z9 {

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f207503o;

    /* renamed from: p, reason: collision with root package name */
    public p35.b f207504p;

    public f(android.content.Context context) {
        super(context, null);
        this.f207503o = new java.util.ArrayList();
        this.f207504p = null;
        q();
    }

    @Override // com.tencent.mm.ui.z9
    public /* bridge */ /* synthetic */ java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        return null;
    }

    @Override // com.tencent.mm.ui.z9, android.widget.Adapter
    public int getCount() {
        return this.f207503o.size();
    }

    @Override // com.tencent.mm.ui.z9, android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (com.tencent.mm.ui.conversation.banner.g) this.f207503o.get(i17);
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.ui.conversation.banner.h hVar;
        com.tencent.mm.ui.conversation.banner.g gVar = (com.tencent.mm.ui.conversation.banner.g) this.f207503o.get(i17);
        if (view == null) {
            view = android.view.View.inflate(this.f212608e, com.tencent.mm.R.layout.f487991dh, null);
            hVar = new com.tencent.mm.ui.conversation.banner.h();
            hVar.f207509a = view;
            hVar.f207510b = (android.widget.Button) view.findViewById(com.tencent.mm.R.id.f482626jo);
            view.setTag(hVar);
        } else {
            hVar = (com.tencent.mm.ui.conversation.banner.h) view.getTag();
        }
        if (gVar.a(hVar) != 0) {
            return null;
        }
        return view;
    }

    @Override // com.tencent.mm.ui.z9
    public void o() {
        q();
    }

    @Override // com.tencent.mm.ui.z9
    public void q() {
        java.util.ArrayList arrayList = this.f207503o;
        arrayList.clear();
        p35.b bVar = this.f207504p;
        if (bVar == null) {
            return;
        }
        arrayList.add(new com.tencent.mm.ui.conversation.banner.g(bVar));
        notifyDataSetChanged();
    }
}
