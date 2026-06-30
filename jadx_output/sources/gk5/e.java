package gk5;

/* loaded from: classes9.dex */
public final class e extends m50.x {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // m50.x
    public co.a V6() {
        return new lb5.a();
    }

    @Override // m50.x
    public boolean k7(xi5.e action) {
        kotlin.jvm.internal.o.g(action, "action");
        com.tencent.mm.ui.chatting.hd.r(getActivity(), getContext().getString(com.tencent.mm.R.string.f492956if3), com.tencent.mm.ui.chatting.hd.d(action.f454741b));
        return true;
    }

    @Override // m50.x
    public void o7(java.lang.String toUser) {
        kotlin.jvm.internal.o.g(toUser, "toUser");
        java.lang.String j17 = ((lb5.a) c7()).j();
        if (j17 == null) {
            return;
        }
        com.tencent.mm.storage.emotion.EmojiInfo N = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).N(j17);
        long k17 = N == null ? com.tencent.mm.vfs.w6.k(j17) : com.tencent.mm.vfs.w6.k(N.N0());
        java.lang.String N0 = N == null ? j17 : N.N0();
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        com.tencent.mm.sdk.platformtools.x.J(N0, options);
        boolean z17 = options.outHeight > ip.c.c() || options.outWidth > ip.c.c();
        if (k17 > ip.c.a() || z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ForwardEmojiUIC", "emoji is over size. ");
            db5.e1.y(getContext(), getString(com.tencent.mm.R.string.bvm), "", getString(com.tencent.mm.R.string.f492294fz1), new gk5.d(this));
            return;
        }
        if (N != null && k17 > ip.c.e()) {
            com.tencent.mm.ui.chatting.n3.h(N, toUser, null);
            return;
        }
        s25.a wi6 = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi();
        android.app.Activity context = getContext();
        lb5.a aVar = (lb5.a) c7();
        long j18 = aVar.getLong(aVar.f43702d + 0);
        lb5.a aVar2 = (lb5.a) c7();
        if (((y12.h) wi6).W(context, toUser, j17, new com.tencent.mm.plugin.msg.MsgIdTalker(j18, aVar2.getString(aVar2.f43702d + 1)), ((lb5.a) c7()).l())) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ForwardEmojiUIC", "Retransmit emoji failed.");
    }
}
