package rr;

/* loaded from: classes.dex */
public final class j implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rr.n f399130d;

    public j(rr.n nVar) {
        this.f399130d = nVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11596, 3);
        android.content.Intent intent = new android.content.Intent();
        rr.n nVar = this.f399130d;
        intent.setClassName(nVar.f399135a, "com.tencent.mm.plugin.emoji.ui.EmojiCustomUI");
        intent.putExtra("key_emoji_panel_type", 0);
        intent.putExtra("key_from_scene", 2);
        android.app.Activity activity = nVar.f399135a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/emoji/util/EmojiCustomHelper$showOverSizeDialog$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/emoji/util/EmojiCustomHelper$showOverSizeDialog$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
