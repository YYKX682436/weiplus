package ri5;

/* loaded from: classes.dex */
public final class a extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.el6;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        ri5.j item = (ri5.j) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        java.lang.String str = item.f396111f;
        int hashCode = str.hashCode();
        android.content.Context context = holder.f293121e;
        switch (hashCode) {
            case -1140598940:
                if (str.equals("fake_user_create_chatroom_choose_open_im")) {
                    java.lang.String Ni = ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).Ni("3552365301", "openim_acct_type_title", j41.a0.TYPE_WORDING);
                    ((android.widget.TextView) holder.p(com.tencent.mm.R.id.f483931ci2)).setText(context.getString(com.tencent.mm.R.string.f490352sk) + Ni);
                    ((com.tencent.mm.ui.widget.MMTextView) holder.p(com.tencent.mm.R.id.t1c)).setVisibility(item.f396118o ? 0 : 8);
                    break;
                }
                break;
            case -181849474:
                if (str.equals("fake_user_create_chatroom_select_contact_in_chatroom")) {
                    ((android.widget.TextView) holder.p(com.tencent.mm.R.id.f483931ci2)).setText(context.getString(com.tencent.mm.R.string.oca));
                    ((com.tencent.mm.ui.widget.MMTextView) holder.p(com.tencent.mm.R.id.t1c)).setVisibility(item.f396118o ? 0 : 8);
                    break;
                }
                break;
            case 434583587:
                if (str.equals("fake_user_create_chatroom_select_chatroom")) {
                    ((android.widget.TextView) holder.p(com.tencent.mm.R.id.f483931ci2)).setText(context.getString(com.tencent.mm.R.string.oc_));
                    ((android.widget.TextView) holder.p(com.tencent.mm.R.id.n0e)).setVisibility(0);
                    break;
                }
                break;
            case 1914591481:
                if (str.equals("fake_user_create_chatroom_face_2_face")) {
                    ((android.widget.TextView) holder.p(com.tencent.mm.R.id.f483931ci2)).setText(context.getString(com.tencent.mm.R.string.oc9));
                    ((com.tencent.mm.ui.widget.MMTextView) holder.p(com.tencent.mm.R.id.t1c)).setVisibility(item.f396118o ? 0 : 8);
                    break;
                }
                break;
        }
        super.h(holder, item, i17, i18, z17, list);
    }
}
