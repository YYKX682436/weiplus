package pf4;

/* loaded from: classes4.dex */
public final class f0 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f353866d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f353867e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f353868f;

    public f0(java.util.ArrayList bubbleDatas) {
        kotlin.jvm.internal.o.g(bubbleDatas, "bubbleDatas");
        this.f353866d = bubbleDatas;
        this.f353867e = "MicroMsg.StoryVisitorListAdapter";
        this.f353868f = new java.util.HashMap();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f353866d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        pf4.c0 holder = (pf4.c0) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = this.f353866d.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        gf4.a aVar = (gf4.a) obj;
        com.tencent.mm.feature.avatar.w wVar = (com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class));
        com.tencent.mm.plugin.story.ui.view.CommentAvatarImageView commentAvatarImageView = holder.f353852e;
        java.lang.String userName = aVar.f271330a;
        wVar.Ni(commentAvatarImageView, userName);
        boolean z17 = false;
        if (aVar.f271335f) {
            commentAvatarImageView.setBackground(commentAvatarImageView.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.b4e));
            int i18 = holder.f353851d;
            commentAvatarImageView.setPadding(i18, i18, i18, i18);
            commentAvatarImageView.setHintBg(commentAvatarImageView.getContext().getResources().getColor(com.tencent.mm.R.color.a7f));
        } else {
            commentAvatarImageView.setBackground(null);
            commentAvatarImageView.setPadding(0, 0, 0, 0);
            commentAvatarImageView.setHintBg(0);
        }
        java.util.HashMap hashMap = holder.f353854g.f353868f;
        ef4.v vVar = ef4.w.f252468t;
        if (!com.tencent.mm.sdk.platformtools.t8.D0(vVar.e(), userName) && vVar.g().P0(userName).t0()) {
            z17 = true;
        }
        hashMap.put(userName, java.lang.Boolean.valueOf(z17));
        commentAvatarImageView.getClass();
        kotlin.jvm.internal.o.g(userName, "userName");
        if (!android.text.TextUtils.equals(commentAvatarImageView.f171880d, userName)) {
            commentAvatarImageView.f171880d = userName;
        }
        commentAvatarImageView.setOnClickListener(new pf4.b0(aVar, holder));
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(aVar.f271330a, true);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.widget.TextView textView = holder.f353853f;
        android.content.Context context = textView.getContext();
        java.lang.String g27 = n17 != null ? n17.g2() : null;
        if (g27 == null) {
            g27 = "";
        }
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, g27, textSize));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        this.f353866d.clone();
        android.view.View inflate = android.view.View.inflate(parent.getContext(), com.tencent.mm.R.layout.cww, null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new pf4.c0(this, inflate, 0, 2, null);
    }
}
