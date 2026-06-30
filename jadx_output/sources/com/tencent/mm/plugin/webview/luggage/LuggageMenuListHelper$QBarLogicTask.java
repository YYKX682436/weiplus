package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
class LuggageMenuListHelper$QBarLogicTask implements com.tencent.mm.ipcinvoker.j {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ipcinvoker.r f182128d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.Map f182129e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f182130f = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.webview.luggage.LuggageMenuListHelper$QBarLogicTask.1
        {
            this.__eventId = 812146647;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent) {
            com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent2 = recogQBarOfImageFileResultEvent;
            if (!(recogQBarOfImageFileResultEvent2 instanceof com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent)) {
                return false;
            }
            com.tencent.mm.plugin.webview.luggage.LuggageMenuListHelper$QBarLogicTask luggageMenuListHelper$QBarLogicTask = com.tencent.mm.plugin.webview.luggage.LuggageMenuListHelper$QBarLogicTask.this;
            java.util.Map map = luggageMenuListHelper$QBarLogicTask.f182129e;
            if (map != null) {
                recogQBarOfImageFileResultEvent2.f54661g.getClass();
                if (!((java.util.HashMap) map).containsKey(0L)) {
                    return false;
                }
            }
            java.util.Map map2 = luggageMenuListHelper$QBarLogicTask.f182129e;
            if (map2 != null) {
                recogQBarOfImageFileResultEvent2.f54661g.getClass();
                ((java.util.HashMap) map2).remove(0L);
            }
            com.tencent.mm.pluginsdk.ui.tools.s6 s6Var = com.tencent.mm.pluginsdk.ui.tools.s6.f191898a;
            java.lang.String e17 = s6Var.e(recogQBarOfImageFileResultEvent2);
            int c17 = s6Var.c(recogQBarOfImageFileResultEvent2);
            int d17 = s6Var.d(recogQBarOfImageFileResultEvent2);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("file_path", recogQBarOfImageFileResultEvent2.f54661g.f6368a);
            bundle.putString("result", e17);
            bundle.putInt("code_type", c17);
            bundle.putInt("code_version", d17);
            luggageMenuListHelper$QBarLogicTask.f182128d.a(bundle);
            return false;
        }
    };

    private LuggageMenuListHelper$QBarLogicTask() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        this.f182128d = rVar;
        int i17 = bundle.getInt("type");
        java.lang.String string = bundle.getString("img_path");
        if (i17 == 1) {
            if (this.f182129e == null) {
                this.f182129e = new java.util.HashMap();
                this.f182130f.alive();
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.autogen.events.RecogQBarOfImageFileEvent recogQBarOfImageFileEvent = new com.tencent.mm.autogen.events.RecogQBarOfImageFileEvent();
            am.aq aqVar = recogQBarOfImageFileEvent.f54659g;
            aqVar.f6174a = currentTimeMillis;
            aqVar.f6175b = string;
            recogQBarOfImageFileEvent.e();
            ((java.util.HashMap) this.f182129e).put(java.lang.Long.valueOf(currentTimeMillis), string);
            return;
        }
        if (i17 != 2) {
            return;
        }
        java.util.Map map = this.f182129e;
        if (map == null || !((java.util.HashMap) map).containsValue(string)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.QBarLogicTask", "%s is not recognizing", string);
            return;
        }
        java.util.Iterator it = ((java.util.HashMap) this.f182129e).keySet().iterator();
        while (it.hasNext()) {
            long longValue = ((java.lang.Long) it.next()).longValue();
            if (((java.lang.String) ((java.util.HashMap) this.f182129e).get(java.lang.Long.valueOf(longValue))).equals(string)) {
                com.tencent.mm.autogen.events.CancelRecogImageFileEvent cancelRecogImageFileEvent = new com.tencent.mm.autogen.events.CancelRecogImageFileEvent();
                cancelRecogImageFileEvent.f54026g.f7686a = longValue;
                cancelRecogImageFileEvent.e();
                ((java.util.HashMap) this.f182129e).remove(java.lang.Long.valueOf(longValue));
            }
        }
    }
}
