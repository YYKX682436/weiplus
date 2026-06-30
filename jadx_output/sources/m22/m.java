package m22;

/* loaded from: classes12.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m22.o f323057d;

    public m(m22.o oVar) {
        this.f323057d = oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/widget/EmojiMineItemSimpleViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        m22.o oVar = this.f323057d;
        m22.p pVar = (m22.p) oVar.f323046d;
        if (pVar != null) {
            oVar.getAdapterPosition();
            m22.j jVar = (m22.j) oVar.f323059e;
            jVar.getClass();
            boolean z17 = pVar instanceof m22.l;
            android.content.Context context = jVar.f323051a;
            if (z17) {
                int i17 = com.tencent.mm.plugin.emoji.ui.EmojiSortUI.f97839f;
                java.lang.String field_key = ((m22.l) pVar).f323055a.field_key;
                kotlin.jvm.internal.o.f(field_key, "field_key");
                kotlin.jvm.internal.o.g(context, "context");
                android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.emoji.ui.EmojiSortUI.class);
                intent.putExtra("type", "type_list_ip_set");
                intent.putExtra("ip_set_key", field_key);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiSortUI$Companion", "showIpList", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/emoji/ui/EmojiSortUI$Companion", "showIpList", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if (pVar instanceof m22.k) {
                r45.qj0 qj0Var = new r45.qj0();
                com.tencent.mm.storage.emotion.EmojiGroupInfo emojiGroupInfo = ((m22.k) pVar).f323054a;
                java.lang.String str = emojiGroupInfo.field_productID;
                qj0Var.f384032d = str;
                qj0Var.f384034f = emojiGroupInfo.field_packName;
                qj0Var.f384044s = emojiGroupInfo.field_packCopyright;
                qj0Var.f384042q = emojiGroupInfo.field_packCoverUrl;
                qj0Var.f384035g = emojiGroupInfo.field_packDesc;
                qj0Var.f384037i = emojiGroupInfo.field_packPrice;
                qj0Var.f384038m = emojiGroupInfo.field_packType;
                qj0Var.f384039n = emojiGroupInfo.field_packFlag;
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str == null) {
                    str = "";
                }
                d22.d0 d0Var = new d22.d0(str, qj0Var, null);
                d0Var.f364198g = jVar.f323053c;
                d0Var.f364155a = jVar.f323052b;
                d22.u.f225876a.a(context, d0Var);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/widget/EmojiMineItemSimpleViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
