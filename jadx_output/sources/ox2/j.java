package ox2;

/* loaded from: classes2.dex */
public final class j implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEgg f349676a;

    public j(com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEgg centerInteractionEasterEgg) {
        this.f349676a = centerInteractionEasterEgg;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        lz5.m mVar = new lz5.m();
        com.tencent.mm.api.IEmojiInfo emoji = this.f349676a.getEmoji();
        if (emoji != null) {
            mVar.put("easter_egg_emoji_md5", emoji.getMd5());
            mVar.put("emoticon_designerid", emoji.X0());
            mVar.put("emoticon_activityid", emoji.S0());
            mVar.put("emoticon_pid", emoji.getGroupId());
        }
        if (kotlin.jvm.internal.o.b(str, "view_unexp")) {
            mVar.put("easter_egg_unexp_type", 1);
        }
        return kz5.b1.b(mVar);
    }
}
