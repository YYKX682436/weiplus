package g32;

/* loaded from: classes13.dex */
public class a extends android.os.Handler {
    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        int i17 = message.what;
        if (i17 != 0) {
            if (i17 == 1 && g32.c.f268148b == 0) {
                g32.c.f268147a = false;
                return;
            }
            return;
        }
        g32.b bVar = (g32.b) message.obj;
        switch (bVar) {
            case SCANNING:
                g32.c.b(1);
                break;
            case STOP_SCANNING:
                g32.c.a(-2);
                break;
            case START_CHANNEL_SERVICE:
                g32.c.b(2);
                break;
            case STOP_CHANNEL_SERVICE:
                g32.c.a(-3);
                break;
            case SIMPLE_BLUETOOTH_SCAN:
                g32.c.b(4);
                break;
            case SIMPLE_BLUETOOTH_STOP_SCAN:
                g32.c.a(-5);
                break;
            case SIMPLE_BLUETOOTH_CONNECT:
                g32.c.b(8);
                break;
            case SIMPLE_BLUETOOTH_DISCONNECT:
                g32.c.a(-9);
                break;
            case WEAR_SERVICE_CREATE:
                g32.c.b(16);
                break;
            case WEAR_SERVICE_DESTROY:
                g32.c.a(-17);
                break;
            case RTOS_SERVICE_CREATE:
                g32.c.b(32);
                break;
            case RTOS_SERVICE_DESTROY:
                g32.c.a(-33);
                break;
        }
        if (g32.c.f268148b > 0) {
            g32.c.f268147a = true;
        } else if (bVar != g32.b.INVOKE_ONCE) {
            g32.c.f268147a = false;
        } else {
            g32.c.f268147a = true;
            g32.c.f268149c.sendEmptyMessageDelayed(1, 20000L);
        }
    }
}
