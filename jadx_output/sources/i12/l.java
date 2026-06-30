package i12;

/* loaded from: classes15.dex */
public class l extends i12.c {
    public final /* synthetic */ i12.m B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(i12.m mVar, android.content.Context context, android.view.View view) {
        super(context, view);
        this.B = mVar;
    }

    @Override // i12.c
    public void b() {
        this.f287175g.setVisibility(8);
        this.f287179k.setVisibility(8);
        this.f287181m.setVisibility(8);
        this.f287182n.setVisibility(8);
        this.f287186r.setVisibility(8);
        android.view.View view = this.f287187s;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/adapter/EmojiStoreMainAdapter$EmojiMainHoler", "fillingShowView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/emoji/adapter/EmojiStoreMainAdapter$EmojiMainHoler", "fillingShowView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f287174f.setVisibility(0);
        this.f287176h.setVisibility(0);
        this.f287183o.setVisibility(0);
    }

    @Override // i12.c
    public int[] c() {
        int h17 = i65.a.h(this.f287194z, com.tencent.mm.R.dimen.f480365vw);
        return new int[]{h17, h17};
    }

    @Override // i12.c
    public int d() {
        return i65.a.h(this.f287194z, com.tencent.mm.R.dimen.f480364vv);
    }

    @Override // i12.c
    public boolean g() {
        return this.B.f287223i;
    }
}
