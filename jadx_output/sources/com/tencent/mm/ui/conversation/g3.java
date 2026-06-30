package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class g3 implements hh4.a {

    /* renamed from: a, reason: collision with root package name */
    public float f207689a = -1.0f;

    /* renamed from: b, reason: collision with root package name */
    public long f207690b = 4294967296L;

    /* renamed from: c, reason: collision with root package name */
    public int f207691c = -1;

    /* renamed from: d, reason: collision with root package name */
    public float f207692d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public long f207693e = 4294967296L;

    /* renamed from: f, reason: collision with root package name */
    public long f207694f = 4294967296L;

    /* renamed from: g, reason: collision with root package name */
    public int f207695g = -1;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ hh4.a f207696h;

    public g3(com.tencent.mm.ui.conversation.ConversationListView conversationListView, hh4.a aVar) {
        this.f207696h = aVar;
    }

    @Override // hh4.a
    public void a(float f17, int i17, int i18) {
        hh4.a aVar = this.f207696h;
        if (aVar != null) {
            if (java.lang.Float.compare(this.f207689a, f17) == 0 && this.f207690b == i17 && this.f207691c == i18) {
                return;
            }
            aVar.a(f17, i17, i18);
            this.f207689a = f17;
            this.f207690b = i17;
            this.f207691c = i18;
        }
    }

    @Override // hh4.a
    public void b(boolean z17) {
        hh4.a aVar = this.f207696h;
        if (aVar != null) {
            int i17 = this.f207695g;
            if (i17 != -1) {
                if ((i17 == 1) == z17) {
                    return;
                }
            }
            aVar.b(z17);
            this.f207695g = z17 ? 1 : 0;
        }
    }

    @Override // hh4.a
    public void c(float f17, int i17, int i18) {
        hh4.a aVar = this.f207696h;
        if (aVar != null) {
            if (java.lang.Float.compare(this.f207692d, f17) == 0 && this.f207693e == i17 && this.f207694f == i18) {
                return;
            }
            aVar.c(f17, i17, i18);
            this.f207692d = f17;
            this.f207693e = i17;
            this.f207694f = i18;
        }
    }
}
