package q50;

/* loaded from: classes.dex */
public final class k extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f360152d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f360153e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f360154f;

    public k(android.content.Context mContext, java.util.List memberAvatarList, java.util.List chatroomMemberList) {
        kotlin.jvm.internal.o.g(mContext, "mContext");
        kotlin.jvm.internal.o.g(memberAvatarList, "memberAvatarList");
        kotlin.jvm.internal.o.g(chatroomMemberList, "chatroomMemberList");
        this.f360152d = mContext;
        this.f360153e = memberAvatarList;
        this.f360154f = chatroomMemberList;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f360154f.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return this.f360154f.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        if (view == null) {
            view = android.view.View.inflate(this.f360152d, com.tencent.mm.R.layout.elu, null);
            view.setTag(new q50.j());
        }
        java.lang.Object tag = view.getTag();
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.feature.forward.ui.PreviewProfileUI.ChatroomMemberAdapter.ViewHolder");
        q50.j jVar = (q50.j) tag;
        jVar.f360150a = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.bgw);
        jVar.f360151b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.bgz);
        if (i17 >= 0) {
            java.util.List list = this.f360154f;
            if (i17 < list.size()) {
                java.util.List list2 = this.f360153e;
                if (i17 < list2.size()) {
                    android.widget.ImageView imageView = jVar.f360150a;
                    kotlin.jvm.internal.o.d(imageView);
                    imageView.setVisibility(0);
                    android.widget.TextView textView = jVar.f360151b;
                    kotlin.jvm.internal.o.d(textView);
                    textView.setVisibility(0);
                    ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(jVar.f360150a, (java.lang.String) list2.get(i17), null);
                    android.widget.TextView textView2 = jVar.f360151b;
                    kotlin.jvm.internal.o.d(textView2);
                    textView2.setText((java.lang.CharSequence) list.get(i17));
                }
            }
        }
        return view;
    }
}
