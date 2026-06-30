package pc;

/* loaded from: classes14.dex */
public final class n extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pc.o f353213a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(pc.o oVar, android.os.Looper looper) {
        super(looper);
        this.f353213a = oVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        if (message.what == 1) {
            final pc.o oVar = this.f353213a;
            if (oVar.f353216c != null) {
                java.util.LinkedList linkedList = oVar.f353218e;
                if (linkedList.size() > 0) {
                    final java.lang.String str = (java.lang.String) linkedList.poll();
                    oVar.f353216c.post(new java.lang.Runnable() { // from class: pc.o$$a
                        @Override // java.lang.Runnable
                        public final void run() {
                            pc.o.this.f353216c.setText(str);
                        }
                    });
                }
            }
            pc.o oVar2 = this.f353213a;
            if (oVar2.f353215b == null) {
                return;
            }
            try {
                android.os.Message obtainMessage = oVar2.f353215b.obtainMessage();
                obtainMessage.what = 1;
                oVar2.f353215b.sendMessageDelayed(obtainMessage, 1000L);
            } catch (java.lang.Exception e17) {
                mc.p.f325531a.e("ShowTipsHelper", "failed to send wait extra tips event" + e17.getLocalizedMessage());
            }
        }
    }
}
